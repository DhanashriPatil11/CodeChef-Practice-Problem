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
            // Read N (total questions) and K (Alice's score)
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            
            // Bob's score is N - K (because Bob answers opposite to Alice)
            int bobScore = N - K;
            
            // Print the result
            System.out.println(bobScore);
        }
        
        // Close the scanner
        scanner.close();
        
        
	}
}
