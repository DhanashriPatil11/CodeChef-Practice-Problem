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
            // Read Alice's and Bob's scores
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // Calculate the remaining points to end the match
            int remainingPoints = 7 - Math.max(A, B);

            // Output the result for the current test case
            System.out.println(remainingPoints);
        }

        scanner.close();

	}
}
