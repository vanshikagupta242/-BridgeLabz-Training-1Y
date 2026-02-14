
import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        // Solution 14: Factorial using while loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial needs positive integer.");
            System.exit(0);
        }
        
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        
        System.out.println("Factorial of " + n + " is " + factorial);
        scanner.close();
    }
}
