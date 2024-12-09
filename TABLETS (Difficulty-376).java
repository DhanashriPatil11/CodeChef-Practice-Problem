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

        // Process each test case
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); // Number of days
            int Y = scanner.nextInt(); // Number of tablets Chef already has

            // Calculate the total number of tablets Chef needs
            int tabletsNeeded = 3 * X;

            // Check if Chef has enough tablets
            if (Y >= tabletsNeeded) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();

	}
}
