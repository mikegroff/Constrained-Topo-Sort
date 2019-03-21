//Michael Groff
// COP 3503, Fall 2017
//2779827

import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

class Vertex
{
  //didnt want to make an edge class so the vertex class holds
  // an identifier, a walk int to keep track of whether weve already attempted to visit all of its neighbors
  // and lists of edges to and from this vertex
  int ident;
  int walked;
  ArrayList<Integer> edgeTo;
  ArrayList<Integer> edgeFrom;

  Vertex(int postion)
  {
    this.ident = postion;
    this.walked = 0;
    this.edgeTo = new ArrayList<Integer>();
    this.edgeFrom = new ArrayList<Integer>();
  }
}

public class  ConstrainedTopoSort
{

  public static int order;
  public static ArrayList<Integer> path;
  public static HashMap<Integer, Boolean> viable;
  public static HashMap<Integer, Vertex> graph;
  public static HashMap<Integer, Boolean> used;

  public ConstrainedTopoSort(String filename)  throws FileNotFoundException
  {
    //this is our constrcuter so we want to initialze everything were using except for path
    //that list is only used to detrmine in a sort exists so we can igrnore it for now
      viable = new HashMap<Integer, Boolean>();
      graph = new HashMap<Integer, Vertex>();
      used = new HashMap<Integer, Boolean>();
      //we scan everything into the graph in O(n) time
      //works a bit differenctly but the first int in ever line determines what to scan
      //into each vertex
      Scanner s = new Scanner(new File(filename));
      int N = s.nextInt();
      order = N;
      Vertex zero = new Vertex(0);//decided to make a zero vertex that will hold all possible starting points
      for(int i=1; i <= N ; i++)
      {
        Vertex V = new Vertex(i);
        graph.put(i,V);
        viable.put(i,true);
      }
      for(int k = 1; k <=N; k++)
      {
        int P = s.nextInt();
        for(int j=0; j < P ; j++)
        {
          int edge = s.nextInt();
          graph.get(k).edgeTo.add(edge);
          graph.get(edge).edgeFrom.add(k);
          viable.put(edge, false);
        }
      }
      for(int l = 1; l <= N; l++)
      {
        if(viable.get(l) == true)
          zero.edgeTo.add(l);
      }
      graph.put(0,zero);
  }

  public boolean hasConstrainedTopoSort(int x, int y)
  {
    path = new ArrayList<Integer>();

    Vertex zero = graph.get(0);
    Vertex at = null;
    for(int m=1; m <= order; m++)
    {
      graph.get(m).walked = 0;//want to reinitialze as we will use this method multiple times on the same graph
      used.put(m,false);//want to make sure nothing is marked as used just yet
    }
    //here i go ahead and take all of the neighbors in the zero vertex
    //use them to increase visisted edges of their neighbors
    for(int j = 0; j < zero.edgeTo.size(); j++)
    {
      int point = zero.edgeTo.get(j);
      if(point == y)//cant go here until x is visited
        continue;
      path.add(point);
      used.put(point,true);
      at = graph.get(point);
      for(int k = 0; k < at.edgeTo.size(); k++)
        graph.get(at.edgeTo.get(k)).walked++;//increase the predecessors visisted at that vertex

    }

    while(path.size() < order)
    {
      int cycle = 0;
      for(int i = 1; i <= order; i++)//loop through the whole graph each time to check if all theyre predecessors have been visited
      {
        if(i == y && used.get(x) == false)//cant visist y unless x has been
        {
          cycle++;
          if(cycle >= order)
            return false;//if weve looped through all without finding something to add to the path there is not sort
          continue;
        }
        at = graph.get(i);
        if(used.get(i) == false && at.walked >= at.edgeFrom.size())
        {
          path.add(i);
          used.put(i,true);
          at = graph.get(i);
          for(int k = 0; k < at.edgeTo.size(); k++)
            graph.get(at.edgeTo.get(k)).walked++;
        }
        else
          cycle++;
        if(cycle >= order)
          return false;// same deal as before
      }
    }
    return true;
  }

  public static double difficultyRating()
  {
  return 3.0;//
  }

  public static double hoursSpent()
  {
  return 4.5;//
  }
}
