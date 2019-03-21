// Jared Johansson
// COP3503 - Fall 2017
// Like badcore, but without the bad core

// ====================================
// ConstrainedTopoSort: TestCase12.java
// ====================================
// Template by Dr. Szumlanski

import java.io.*;
import java.util.*;

public class TestCase12
{
  private static void failwhale(String params)
	{
		System.out.println("hasConstrainedTopoSort(" + params + "): fail whale :(");
		System.exit(0);
	}

	public static void main(String [] args) throws IOException
	{
    ConstrainedTopoSort t = new ConstrainedTopoSort("inputs/goodcore.txt");

    if (t.hasConstrainedTopoSort(9, 10) != true) failwhale("9, 10");
    if (t.hasConstrainedTopoSort(10, 9) != true) failwhale("10, 9");
    if (t.hasConstrainedTopoSort(7, 6) != true) failwhale("7, 6");
    if (t.hasConstrainedTopoSort(5, 8) != true) failwhale("5, 8");
    if (t.hasConstrainedTopoSort(9, 1) != true) failwhale("9, 1");
    if (t.hasConstrainedTopoSort(10, 4) != true) failwhale("10, 4");
    if (t.hasConstrainedTopoSort(2, 3) != false) failwhale("2, 3");
    if (t.hasConstrainedTopoSort(3, 2) != true) failwhale("3, 2");
    if (t.hasConstrainedTopoSort(1, 3) != true) failwhale("1, 3");

    System.out.println("Hooray!");
	}
}
