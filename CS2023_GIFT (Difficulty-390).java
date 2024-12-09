import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner scanner = new Scanner(System.in);

        // Read the input values
        int X = scanner.nextInt(); // Amount Om has
        int N = scanner.nextInt(); // Price of the laptop
        int M = scanner.nextInt(); // Amount in the Gymkhana fund

        // Check if Om can buy the laptop
        if (X + M >= N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Close the scanner
        scanner.close();
	}
}
