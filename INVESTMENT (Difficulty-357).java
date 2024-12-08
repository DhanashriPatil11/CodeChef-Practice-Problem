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
        
        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Read the interest rate (X) and inflation rate (Y)
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // Check if the investment is good
            if (X >= 2 * Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner object
        scanner.close();

	}
}
