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
        
        // Loop through all test cases
        for (int i = 0; i < T; i++) {
            // Read the goals scored by both teams
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            // Check if the match is a draw and at least one goal was scored
            if (X == Y && X > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner object
        sc.close();

	}
}
