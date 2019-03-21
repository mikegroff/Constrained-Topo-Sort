// Jared Johansson
// COP3503 - Fall 2017
// Unconnected graph, one side lost in disarray

// ====================================
// ConstrainedTopoSort: TestCase09.java
// ====================================
// Template by Dr. Szumlanski

import java.io.*;
import java.util.*;

public class TestCase09
{
  private static void failwhale(String params)
	{
		System.out.println("hasConstrainedTopoSort(" + params + "): fail whale :(");
		System.exit(0);
	}

	public static void main(String [] args) throws IOException
	{
		ConstrainedTopoSort t = new ConstrainedTopoSort("inputs/onlyside.txt");

		if (t.hasConstrainedTopoSort(1, 5) != false) failwhale("1, 5");
    if (t.hasConstrainedTopoSort(1, 4) != false) failwhale("1, 4");
		if (t.hasConstrainedTopoSort(5, 1) != false) failwhale("5, 1");
    if (t.hasConstrainedTopoSort(2, 7) != false) failwhale("2, 7");
		if (t.hasConstrainedTopoSort(4, 6) != false) failwhale("4, 6");
    if (t.hasConstrainedTopoSort(5, 3) != false) failwhale("5, 3");
    if (t.hasConstrainedTopoSort(7, 5) != false) failwhale("7, 5");
    if (t.hasConstrainedTopoSort(3, 1) != false) failwhale("3, 1");
    if (t.hasConstrainedTopoSort(9, 10) != false) failwhale("9, 10");
    if (t.hasConstrainedTopoSort(10, 5) != false) failwhale("10, 5");

		System.out.println("Hooray!");
	}
}
