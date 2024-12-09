import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the spice level X
            int X = scanner.nextInt();

            // Determine the category based on the spice level
            if (X < 4) {
                System.out.println("MILD");
            } else if (X >= 4 && X < 7) {
                System.out.println("MEDIUM");
            } else {
                System.out.println("HOT");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
