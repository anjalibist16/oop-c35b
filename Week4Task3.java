public class Week4Task3 {
    public static void main(String[] args) {
        //   3. Write a program that generates the following table: 
        //Number    Square
        //10    100
        //9    81
        //..    ….2    4
        //1    1
        int number;
        System.out.println("Number     Number Squared");
        System.out.println("---------------");
        for (number=10; number >= 1; number --)
        {
            System.out.println(number + "\t\t" +  
                                number * number);
        }
    }

}
