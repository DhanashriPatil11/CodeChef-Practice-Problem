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
            // Read the number of donations for this test case
            int X = scanner.nextInt();
            
            // Determine the badge based on the number of donations
            if (X <= 3) {
                System.out.println("BRONZE");
            } else if (X <= 6) {
                System.out.println("SILVER");
            } else {
                System.out.println("GOLD");
            }
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();

	}
}
