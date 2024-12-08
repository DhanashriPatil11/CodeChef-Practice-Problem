import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int T = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Input the number of hours
            int N = scanner.nextInt();

            // Calculate the total water required
            int totalWater = N * 2;

            // Output the result
            System.out.println(totalWater);
        }

        scanner.close();

	}
}
