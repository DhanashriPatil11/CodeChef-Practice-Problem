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
            // Read X and Y for the current test case
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Compare X and Y and print the result
            if (X > Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();

	}
}
