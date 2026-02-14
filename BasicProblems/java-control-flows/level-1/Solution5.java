
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        // Solution 5: Voting Eligibility
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        scanner.close();
    }
}
