public class TaskToDoWeek3 {
    public static void main(String[] args) {

        // 1. Write a JAVA program to find the maximum between three numbers.
        int a = 10;
        int b = 50;
        int c = 30;
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The maximum number is: " + max);

        // 2. Write a JAVA program to check whether a number is negative, positive, or
        // zero.
        int num = 020;
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else if (num == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println("Invalid");
        }

        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or
        // not.
        int number = 50;
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("The number is divisible by 5 and 11");
        } else {
            System.out.println("The number is not divisible by 5 and 11");
        }

        // 4. Write a JAVA program to check whether a number is even or odd.
        int num1 = 56;
        if (num1 % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        // 5. Write a JAVA program to check whether a year is a leap year or not.
        //Hint: if year%4==0; if year%100!==0 ; year%400==0; 
        int year = 2100;
        if (year % 400 == 0) {
            System.out.println("The year is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("The year is not a leap year");
        } else if (year % 4 == 0) {
        } else {
            System.out.println("The year is not a leap year");
        }

   // Convert the character to lowercase to handle both uppercase and lowercase inputs
 char ch = 'i';
   // Check if the input character is an alphabet
   if ((ch >= 'a' && ch <= 'z')) {
       // Check if the alphabet is a vowel
       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
           System.out.println("The character is a vowel.");
       } else {
           System.out.println("The character is a consonant.");
       }
   } else {
       System.out.println("Invalid input. Please enter an alphabet.");
   }

   // Some Switch case Statements Questions:

//1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and
// converts it to the corresponding GPA value. Use a switch case statement to handle different grades.


      





    }

}
