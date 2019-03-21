// Jared Johansson
// COP3503 - Fall 2017
// Node with self loop, two nodes point to each other

// ====================================
// ConstrainedTopoSort: TestCase10.java
// ====================================
// Template by Dr. Szumlanski

import java.io.*;
import java.util.*;

public class TestCase10
{
  private static void failwhale(String params)
	{
		System.out.println("hasConstrainedTopoSort(" + params + "): fail whale :(");
		System.exit(0);
	}

	public static void main(String [] args) throws IOException
	{
		ConstrainedTopoSort t = new ConstrainedTopoSort("inputs/loopyloops.txt");

		if (t.hasConstrainedTopoSort(2, 1) != false) failwhale("2, 1");
    if (t.hasConstrainedTopoSort(2, 3) != false) failwhale("2, 3");
		if (t.hasConstrainedTopoSort(1, 3) != false) failwhale("1, 3");
    if (t.hasConstrainedTopoSort(4, 3) != false) failwhale("4, 3");

		System.out.println("Hooray!");
	}
}
