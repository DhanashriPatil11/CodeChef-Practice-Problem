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
            // Input the current number of seats and the number of interested students
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Calculate the minimum number of seats to be added
            if (Y > X) {
                System.out.println(Y - X);
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
	}
}
