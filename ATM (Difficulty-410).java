import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		 Scanner sc = new Scanner(System.in);
        
        // Read the values of X (withdrawal amount) and Y (current balance)
        int X = sc.nextInt();
        double Y = sc.nextDouble();
        
        // Check if X is a multiple of 5 and if the balance is sufficient
        if (X % 5 == 0 && Y >= X + 0.50) {
            // Deduct X and 0.50 (the bank charge)
            Y -= (X + 0.50);
        }
        
        // Output the remaining balance with two decimal places
        System.out.printf("%.2f\n", Y);
        
        // Close the scanner object
        sc.close();

	}
}
