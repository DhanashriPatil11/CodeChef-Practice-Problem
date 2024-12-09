import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read Chef's rating (X) and the problem's difficulty (Y)
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // Check if Y is within the range [X, X + 200]
            if (Y >= X && Y <= X + 200) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner
        scanner.close();

	}
}
