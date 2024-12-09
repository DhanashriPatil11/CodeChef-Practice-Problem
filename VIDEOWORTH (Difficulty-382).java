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
            // Read the duration of the video in seconds
            int S = scanner.nextInt();
            
            // Calculate the worth of the video in words
            int worth = 24 * S * 1000;
            
            // Output the worth for this test case
            System.out.println(worth);
        }
        
        // Close the scanner
        scanner.close();

	}
}
