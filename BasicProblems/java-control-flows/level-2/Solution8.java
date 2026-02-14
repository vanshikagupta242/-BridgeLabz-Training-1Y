
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        // Solution 8: Factors using while loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Factors of " + number + ": ");
        int i = 1;
        while (i <= number) { // Using <= to include number itself
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        scanner.close();
    }
}
