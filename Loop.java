public class Loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        for (int s = 1; s <=5; s++){
            System.out.println("Hello World");
        }
        // Example 3: (The Program prints the sum of x ranging from 1 to 20)
        int sum = 0;
        for (int x = 1; x<=20; x++){
            sum = sum + x;
        }
        System.out.println("The sum of x ranging from 1 to 20 is: " + sum);


        int number; 
        System.out.println("Number Number Squared");
        System.out.println("-----------------");
        for (number = 1; number <= 10; number++) {
            System.out.println(number + "\t\t " + number * number);
        }
    }
}