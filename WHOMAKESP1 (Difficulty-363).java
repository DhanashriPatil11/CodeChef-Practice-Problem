import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner scanner = new Scanner(System.in);

        // Input: Read two integers A and B
        int A = scanner.nextInt(); // Tyro's patience level
        int B = scanner.nextInt(); // Number of times Dom tries to convince Tyro

        // Logic to determine who makes the problem
        if (B >= A) {
            System.out.println("Tyro");
        } else {
            System.out.println("Dom");
        }

        scanner.close();

	}
}
