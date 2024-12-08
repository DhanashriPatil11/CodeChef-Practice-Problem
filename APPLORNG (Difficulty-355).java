import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner scanner = new Scanner(System.in);
        
        // Read the amount of money Bob has
        int X = scanner.nextInt();
        
        // Read the cost per kg of apples and oranges
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Check if Bob can buy 1 kg of both apples and oranges
        if (X >= A + B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // Close the scanner object
        scanner.close();
    }
	
}
