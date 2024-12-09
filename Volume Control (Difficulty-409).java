import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		 Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the initial and final volumes
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            // Output the absolute difference between the volumes
            System.out.println(Math.abs(X - Y));
        }
        
        // Close the scanner
        sc.close();

	}
}
