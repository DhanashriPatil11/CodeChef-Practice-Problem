import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
       Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the amount X Chef needs to pay
            int X = scanner.nextInt();

            // Calculate the number of 1-rupee coins Chef needs
            int coins = X % 10;

            // Output the number of coins required
            System.out.println(coins);
        }

        // Close the scanner
        scanner.close();
    }
}

