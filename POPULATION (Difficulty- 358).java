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
            // Read the initial population (X), people left (Y), and people immigrated (Z)
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();
            
            // Calculate the final population
            int finalPopulation = X - Y + Z;
            
            // Output the final population for this test case
            System.out.println(finalPopulation);
        }
        
        // Close the scanner object
        scanner.close();
	}
}
