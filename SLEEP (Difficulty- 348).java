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
            // Input the number of hours slept
            int X = scanner.nextInt();

            // Check if the person is sleep deprived
            if (X < 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();

	}
}
