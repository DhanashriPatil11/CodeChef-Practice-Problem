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
            // Read the dimensions of the plate and the cost per cm
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int X = scanner.nextInt();

            // Calculate the perimeter of the rectangle
            int perimeter = 2 * (N + M);

            // Calculate the cost of the wireframe
            int cost = perimeter * X;

            // Output the total cost
            System.out.println(cost);
        }

        // Close the scanner
        scanner.close();

	}
}
