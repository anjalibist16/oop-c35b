import java.util.Scanner;
public class Week4Task6 {
    public static void main(String[] args) {
        /*
         6. Write a program that reads the width and generates a corresponding
          triangle of *. For example, if width = 5, output is:
         *
         **
         ***
         ****
         *****
         */
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the width of triangle: ");
        int width = scanner.nextInt();
        for (int i = 1; i < width; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }

}


