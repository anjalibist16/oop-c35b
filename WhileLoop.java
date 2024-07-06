import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            System.out.println("Hello");
            number++;
        }
        System.out.println("Thats all !!!!! " );


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number in the range of 10 through 100: ");
        int number1 = keyboard.nextInt();
        while (number1 < 10 || number1 > 100) {
            System.out.println("Invalid number. Try again: ");
            System.out.println("Enter a number in the range of 10 through 100: ");
            number1 = keyboard.nextInt();
        }
        System.out.println("Thank you for entering a valid number. ");
        keyboard.close();


        // Infinite while loop 
       // while (true){
          //  System.out.println("Infinite while loop");
       
    
        }
    }

