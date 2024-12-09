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
            // Read X and Y for the current test case
            int X = scanner.nextInt(); // Litres of fuel
            int Y = scanner.nextInt(); // Distance to home in km
            
            // Calculate the maximum distance Chef can travel with the available fuel
            int maxDistance = 5 * X;
            
            // Determine if Chef can reach home
            if (maxDistance >= Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner
        scanner.close();

	}
}
