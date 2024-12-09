import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
             Scanner sc = new Scanner(System.in);
        
        // Read the two integers a and b
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Calculate the height of the fraction as the maximum of a and b
        int height = Math.max(a, b);
        
        // Output the result
        System.out.println(height);
        
        // Close the scanner
        sc.close();
	}
}
