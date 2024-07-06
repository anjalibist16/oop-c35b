import java.util.Scanner;

public class SwitchTask1Week3 {
    public static void main(String[] args) {
        // Some Switch case Statements Questions:

        // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or
        // F) and
        // converts it to the corresponding GPA value. Use a switch case statement to
        // handle different grades.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        String grade = input.nextLine();
        switch (grade) {
            case "A":
                System.out.println("Your GPA is 4.0");
                break;
            case "B":
                System.out.println("Your GPA is 3.0");
                break;
            case "C":
                System.out.println("Your GPA is 2.0");
                break;
            case "D":
                System.out.println("Your GPA is 1.0");
                break;
            case "F":
                System.out.println("Your GPA is 0.0");
                break;
            default:
                System.out.println("Invalid grade");
     
       }



       //2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and 
       //performs the corresponding arithmetic operation using a switch case statement.
       Scanner input2 = new Scanner(System.in);
       System.out.println("Enter your first number: ");
       int num1 = input2.nextInt();
       System.out.println("Enter your second number: ");
       int num2 = input2.nextInt();
       System.out.println("Enter your operator: ");
       String operator = input2.nextLine();
       switch (operator) {
        case "+":
        System.out.println(num1 + num2);
        break;
        case "-":
        System.out.println(num1 - num2);
        break;
        case "*":
        System.out.println(num1 * num2);
        break;
        case "/":
        if (num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Error: Division by zero");
        }
        break;
        default:
        System.out.println("Invalid operator");
       }

    }

}

