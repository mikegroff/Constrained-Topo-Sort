// Jared Johansson
// COP3503 - Fall 2017
// Unconnected graph

// ====================================
// ConstrainedTopoSort: TestCase08.java
// ====================================
// Template by Dr. Szumlanski

import java.io.*;
import java.util.*;

public class TestCase08
{
  private static void failwhale(String params)
	{
		System.out.println("hasConstrainedTopoSort(" + params + "): fail whale :(");
		System.exit(0);
	}

	public static void main(String [] args) throws IOException
	{
		ConstrainedTopoSort t = new ConstrainedTopoSort("inputs/twosides.txt");

		if (t.hasConstrainedTopoSort(1, 5) != true) failwhale("1, 5");
		if (t.hasConstrainedTopoSort(5, 1) != true) failwhale("5, 1");
    if (t.hasConstrainedTopoSort(2, 7) != true) failwhale("2, 7");
		if (t.hasConstrainedTopoSort(4, 6) != true) failwhale("4, 6");
    if (t.hasConstrainedTopoSort(5, 3) != true) failwhale("5, 3");
    if (t.hasConstrainedTopoSort(7, 5) != false) failwhale("7, 5");
    if (t.hasConstrainedTopoSort(3, 1) != false) failwhale("3, 1");

		System.out.println("Hooray!");
	}
}
