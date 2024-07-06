import java.util.Scanner;

public class UserDetail {
    public static void main(String[] args) {
        // Scanner class with input (object) is created 
        Scanner input = new Scanner(System.in); // system.in is used for - read from keyword 
        System.out.println("Enter name, age, and salary: ");

        // String input 
        String name = input.nextLine();

        // numerical input 
        int age = input.nextInt();
        double salary = input.nextDouble();

        // Consuming the leftover newline character
        input.nextLine();

        // output input by user 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        System.out.println("Enter your Contact number: ");
        String contact = input.nextLine();
        System.out.println("My Contact is " + contact);
        input.close();
    }
}
