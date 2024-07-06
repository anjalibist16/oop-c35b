import java.util.Scanner;

public class SwitchTask4 {
    public static void main(String[] args) {
        // Implement a Java program that calculates the area of different shapes
        // (circle, rectangle, square, triangle) based on the user's choice using a
        // switch case.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you want to calculate the area of: ");
        String shape = sc.nextLine();
        switch (shape) {
            case "circle":
                System.out.println("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                double area = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + area);
                break;
            case "rectangle":
                System.out.println("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.println("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                area = length * width;
                System.out.println("The area of the rectangle is: " + area);
                break;
            case "square":
                System.out.println("Enter the length of the square: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("The area of the square is: " + area);
                break;
            case "triangle":
                System.out.println("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                area = (base * height) / 2;
                System.out.println("The area of the triangle is: " + area);
                break;
        }
    }

}
