public class Operator{
    public static void main(String[]args){
        /* Arithmetic operator */
        int aNum1 = 10;
        int aNum2 = 20;
        int sum = aNum1 + aNum2; //+ is an arthmetic operator 
        System.out.println("Addition is "+ sum);
        System.out.println("Substration is "+ (aNum1 - aNum2 ));
        System.out.println("Multiplication is "+(aNum1 * aNum2));
        System.out.println("Division is " + (aNum1 / aNum2));
        System.out.println("Modulo is " + (aNum1 % aNum2));

        /* Assignment Operator*/
        int asNum1 = 30; //= is used to assign a value to variable 
        asNum1 = asNum1 + 1;
        System.out.println("+= Value is " + asNum1);
        System.out.println(" -= value is " + (asNum1 -= 10));
        System.out.println(" *= Value is " +  (asNum1 *= 10));
        System.out.println(" /= Value is " + (asNum1 /= 12));
        System.out.println(" *= Value is " + (asNum1 %= 3));

        /* Relational operator */
        int rNum1 = 20, rNum2 = 21;
        boolean rExpression = rNum1 == rNum2; // return ttrue or false 
        System.out.println("Equals to " + rExpression);
        System.out.println("Greater than " + (rNum1 > rNum2) );
        System.out.println("Less than " + (rNum1< rNum2));
        System.out.println("Not equals to "+ (rNum1 !=rNum2));
        System.out.println("Greater than equal to " + (rNum1>=rNum2));
        System.out.println("Less than equal to " + (rNum1<=rNum2));
        /* Logical Operator */
        int 







    }

}