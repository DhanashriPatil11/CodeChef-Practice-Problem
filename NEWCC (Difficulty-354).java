import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

        Scanner scanner = new Scanner(System.in);

        // Input the runtimes on old and new systems
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Determine which system is faster
        if (X < Y) {
            System.out.println("Old");
        } else if (X > Y) {
            System.out.println("New");
        } else {
            System.out.println("Same");
        }

        scanner.close();
    }
}