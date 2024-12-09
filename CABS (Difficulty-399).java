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
            // Read the prices of the two cab services
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // Compare the prices and print the result
            if (X < Y) {
                System.out.println("FIRST");
            } else if (X > Y) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
        
        // Close the scanner
        scanner.close();

	}
}
