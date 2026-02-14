
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        // Solution 8: Countdown using while loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        scanner.close();
    }
}
