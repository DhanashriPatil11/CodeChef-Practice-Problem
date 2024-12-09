import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
        
        // Number of test cases
        int T = sc.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Read the values of X and Y
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            // Calculate the new profit
            double newProfit = Y + 0.10 * X;
            
            // Output the result (rounded to the nearest integer)
            System.out.println((int) newProfit);
        }
        
        sc.close();

	}
}
