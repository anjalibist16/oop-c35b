import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (0 to exit): ");
            number = sc.nextInt();
            if (number != 0) {
                sum += number; // Add the input number to the sum
            }
        } while (number != 0);

        System.out.println("The sum of the numbers entered is: " + sum);
        sc.close();

        // Infinite Do While Loop
        // do{
        // System.out.println("Infinitie do while loop");
        // }while(true);
        // }

    }

}