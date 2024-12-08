import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		 Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int T = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Input the current time
            int X = scanner.nextInt();

            // Check if it is lunchtime
            if (X >= 1 && X <= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();

	}
}
