import java.util.Scanner;
public class Week4Task4 {
    public static void main(String[] args) {
        // 4. Write a program that reads the width and generates a corresponding square
        // of *. For example, if width = 5, output is:
        // *****
        // *****
        // *****
        // *****
        // *****

        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the width
        System.out.print("Enter the width of the square: ");
        int width = scanner.nextInt();

        // Loop to generate the square
        for (int i = 0; i < width; i++) {         // Loop for rows
            for (int j = 0; j < width; j++) {     // Loop for columns
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }

        scanner.close();
    }
}

