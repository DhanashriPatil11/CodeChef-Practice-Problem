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
            // Read the number of kilometers travelled
            int X = scanner.nextInt();

            // Calculate the minimum kilometers Chef needs to pay for
            int kmsToPayFor = Math.max(X, 300);

            // Calculate the total cost
            int cost = kmsToPayFor * 10;

            // Output the cost for the current test case
            System.out.println(cost);
        }

        scanner.close();

	}
}
