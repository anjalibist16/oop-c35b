public class TypeCasting {
    public static void main (String[]args){
        //Implicit type casting 
        int myInt = 9;
        long myLong = myInt;//  Automatic casting: int to long
        System.out.println("Value of myInt is :  "+myInt);
        System.out.println("Value of myLong is: "+myLong);

        // Manual casting // explicit 
        long mylong = 10;
        int myint = (int)mylong;
        System.out.println("The value of mylong: "+mylong);
        System.out.println("The value of myint "+ myint);


    }
    
}
