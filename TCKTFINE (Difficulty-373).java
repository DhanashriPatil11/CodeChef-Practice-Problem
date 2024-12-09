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
            // Read X, P, and Q for the current test case
            int X = scanner.nextInt();  // Fine per passenger without ticket
            int P = scanner.nextInt();  // Total number of passengers
            int Q = scanner.nextInt();  // Number of tickets collected

            // Calculate the number of passengers without tickets
            int passengersWithoutTicket = P - Q;

            // Calculate the total fine collected
            int totalFine = passengersWithoutTicket * X;

            // Output the total fine for the current test case
            System.out.println(totalFine);
        }

        scanner.close();
	}
}
