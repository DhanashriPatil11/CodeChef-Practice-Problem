import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // Your code goes here
            
             // Calculate the total money Chef has
            int totalMoney = x * 5 + y * 10;

            // Calculate the maximum number of chocolates Chef can buy
            int maxChocolates = totalMoney / z;

            // Output the result for this test case
            System.out.println(maxChocolates);
        }

        // Close the scanner
        scanner.close();
        
    }
}
