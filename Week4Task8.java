import java.util.Scanner;

public class Week4Task8 {
    public static void mian(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * 8. Write a program that prompts the user to input an integer and then outputs
         * the number with the digits reversed.
         * For example, if the input is 12345, the output should be 54321.
         */

        System.out.println("Enter the numbers: ");
        int number = sc.nextInt();

        int reversedNumber = revisedDigits(number);
        System.out.println("Revised Number " + reversedNumber);

        sc.close();
    }

    // Function to reverse the digits of a number
    public static int revisedDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;

        }
        return reversed;

    }

}
