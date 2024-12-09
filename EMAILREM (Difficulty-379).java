import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
             Scanner scanner = new Scanner(System.in);
        
        // Read the values of N and U
        int N = scanner.nextInt();
        int U = scanner.nextInt();
        
        // Calculate the number of users who should receive emails
        int result = N - U;
        
        // Output the result
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
	}
}
