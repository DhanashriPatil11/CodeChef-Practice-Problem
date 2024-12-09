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
            // Read the costs for both styles
            int X1 = scanner.nextInt();
            int Y1 = scanner.nextInt();
            int X2 = scanner.nextInt();
            int Y2 = scanner.nextInt();

            // Calculate the total cost for both styles
            int costStyle1 = X1 + Y1;
            int costStyle2 = X2 + Y2;

            // Output the minimum cost
            System.out.println(Math.min(costStyle1, costStyle2));
        }

        scanner.close();

	}
}
