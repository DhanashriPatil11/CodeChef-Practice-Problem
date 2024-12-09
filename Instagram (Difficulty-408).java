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
            // Read the following and follower counts
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            // Check if the account is a spam
            if (X > 10 * Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner
        sc.close();

	}
}
