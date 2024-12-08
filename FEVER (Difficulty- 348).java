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
            // Input the body temperature
            int X = scanner.nextInt();

            // Check if the temperature indicates fever
            if (X > 98) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();

	}
}
