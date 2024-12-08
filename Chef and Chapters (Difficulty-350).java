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
            // Input the number of courses, units, and chapters
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();

            // Calculate the total number of chapters
            int totalChapters = X * Y * Z;

            // Output the result
            System.out.println(totalChapters);
        }

        scanner.close();
	}
}
