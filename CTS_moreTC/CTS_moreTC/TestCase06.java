// Jared Johansson
// COP3503 - Fall 2017
// Topograph from Exam 2

// ====================================
// ConstrainedTopoSort: TestCase06.java
// ====================================
// Template by Dr. Szumlanski

import java.io.*;
import java.util.*;

public class TestCase06
{
  private static void failwhale(String params)
	{
		System.out.println("hasConstrainedTopoSort(" + params + "): fail whale :(");
		System.exit(0);
	}

	public static void main(String [] args) throws IOException
	{
		ConstrainedTopoSort t = new ConstrainedTopoSort("inputs/triggerwarning.txt");

		if (t.hasConstrainedTopoSort(4, 5) != true) failwhale("5, 5");
		if (t.hasConstrainedTopoSort(8, 9) != true) failwhale("8, 9");
    if (t.hasConstrainedTopoSort(5, 10) != true) failwhale("5, 10");
		if (t.hasConstrainedTopoSort(10, 8) != false) failwhale("10, 8");
    if (t.hasConstrainedTopoSort(6, 5) != false) failwhale("6, 5");
    if (t.hasConstrainedTopoSort(12, 11) != false) failwhale("12, 11");
    if (t.hasConstrainedTopoSort(10, 8) != false) failwhale("1, 4");

		System.out.println("Hooray!");
	}
}
