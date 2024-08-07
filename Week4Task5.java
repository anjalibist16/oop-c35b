import java.nio.channels.NetworkChannel;
import java.util.Scanner;
public class Week4Task5 {
    public static void main(String[] args) {
        /*
         * 5. Modify the above program by using a do..while loop so that it provides the
         * user with the option to continue running the program and enter more inputs.
         * For example:
         * Sample Run:
         * Enter a positive non-zero integer 4
         * Sum of 1 to 4 is 10
         * Do you want to continue? Enter ‘y’ for yes or any other character for no.
         * y
         * Enter a positive non-zero integer 3
         * Sum of 1 to 3 is 6
         * Do you want to continue? Enter ‘y’ for yes and any other character for no.
         * n.
         */

        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Prompt user to enter a positive non-zero integer
            System.out.print("Enter a positive non-zero integer: ");
            int num = scanner.nextInt();

            // Calculate the sum of integers from 1 to num
            int sum = 0;
            
            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            // Print the sum
            System.out.println("Sum of 1 to " + num + " is " + sum);

            // Ask if the user wants to continue
            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
