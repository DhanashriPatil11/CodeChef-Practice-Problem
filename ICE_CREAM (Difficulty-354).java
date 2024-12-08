import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        
        // Read the values for X and Y
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        // Check if Chef can buy two ice creams
        if (Y >= 2 * X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        // Close the scanner object
        scanner.close();

	}
}
