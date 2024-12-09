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
            // Read the temperature for the current test case
            int C = sc.nextInt();
            
            // Determine if the temperature is HOT or COLD
            if (C > 20) {
                System.out.println("HOT");
            } else {
                System.out.println("COLD");
            }
        }
        
        // Close the scanner object
        sc.close();
	}
}
