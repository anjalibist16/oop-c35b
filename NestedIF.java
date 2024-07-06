public class NestedIF {
    public static void main(String[] args) {
        int age = 18, weight = 46;
        if (age>= 18){
            System.out.println("You are eligible to vote.");

            if (weight >= 50){
                System.out.println("You are eligible to vote and donate blood");
             } else
                System.out.println("You are not eligible to donate blood");
            } else 
            System.out.println("You are not eligible for both ! ");

        }
    }

    /*e. Nested if statement
    A nested if is an if statement that has another if in its if’s body or in its else’s body. 
    As Java allows nested if statements, we can place an if or else-if statement inside another if statement.*/
