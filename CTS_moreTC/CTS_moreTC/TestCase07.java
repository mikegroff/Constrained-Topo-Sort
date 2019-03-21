// Jared Johansson
// COP3503 - Fall 2017
// An apple shaped graph?

// ====================================
// ConstrainedTopoSort: TestCase07.java
// ====================================
// Template by Dr. Szumlanski

import java.io.*;
import java.util.*;

public class TestCase07
{
  private static void failwhale(String params)
	{
		System.out.println("hasConstrainedTopoSort(" + params + "): fail whale :(");
		System.exit(0);
	}

	public static void main(String [] args) throws IOException
	{
		ConstrainedTopoSort t = new ConstrainedTopoSort("inputs/badcore.txt");

		if (t.hasConstrainedTopoSort(9, 10) != false) failwhale("9, 10");
		if (t.hasConstrainedTopoSort(10, 9) != false) failwhale("10, 9");
    if (t.hasConstrainedTopoSort(7, 6) != false) failwhale("7, 6");
		if (t.hasConstrainedTopoSort(5, 8) != false) failwhale("5, 8");
    if (t.hasConstrainedTopoSort(9, 1) != false) failwhale("9, 1");
    if (t.hasConstrainedTopoSort(10, 4) != false) failwhale("10, 4");
    if (t.hasConstrainedTopoSort(2, 3) != false) failwhale("2, 3");
    if (t.hasConstrainedTopoSort(3, 2) != false) failwhale("3, 2");

		System.out.println("Hooray!");
	}
}
