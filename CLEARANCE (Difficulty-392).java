import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);

        // Read the number of t-shirts Chef paid for
        int X = scanner.nextInt();

        // Calculate the total number of t-shirts Chef gets
        int totalTShirts = X + (X / 2);

        // Output the total number of t-shirts
        System.out.println(totalTShirts);

        // Close the scanner
        scanner.close();
	}
}
