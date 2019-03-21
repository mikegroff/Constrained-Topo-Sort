// Jared Johansson
// COP3503 - Fall 2017
// A sweet box shaped star

// ====================================
// ConstrainedTopoSort: TestCase11.java
// ====================================
// Template by Dr. Szumlanski
// Graph created by Mat Drabek

import java.io.*;
import java.util.*;

public class TestCase11
{
  private static void failwhale(String params)
	{
		System.out.println("hasConstrainedTopoSort(" + params + "): fail whale :(");
		System.exit(0);
	}

	public static void main(String [] args) throws IOException
	{
		ConstrainedTopoSort t = new ConstrainedTopoSort("inputs/matsbaby.txt");

		if (t.hasConstrainedTopoSort(1, 5) != true) failwhale("1, 5");
    if (t.hasConstrainedTopoSort(11, 9) != true) failwhale("11, 9");
    if (t.hasConstrainedTopoSort(12, 8) != true) failwhale("12, 8");
    if (t.hasConstrainedTopoSort(1, 13) != true) failwhale("1, 13");
    if (t.hasConstrainedTopoSort(13, 9) != false) failwhale("13, 9");
		if (t.hasConstrainedTopoSort(10, 3) != false) failwhale("10, 3");

		System.out.println("Hooray!");
	}
}
