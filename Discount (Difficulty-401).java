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
            // Read the discount percentage for this test case
            int x = scanner.nextInt();

            // Calculate the price Alice needs to pay
            int priceToPay = 100 - x;

            // Output the result
            System.out.println(priceToPay);
        }

        // Close the scanner
        scanner.close();

	}
}
