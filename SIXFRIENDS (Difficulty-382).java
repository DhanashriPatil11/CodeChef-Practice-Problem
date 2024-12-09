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
            // Read the cost of double and triple rooms
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // Calculate the cost for three double rooms and two triple rooms
            int cost1 = 3 * X;
            int cost2 = 2 * Y;
            
            // Output the minimum cost
            System.out.println(Math.min(cost1, cost2));
        }
        
        // Close the scanner
        scanner.close();

	}
}
