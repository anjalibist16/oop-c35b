import java.util.Scanner; // for get user input 
public class IO {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        // display message for user 
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("My name is " + name);

       // Display message for user 
       System.out.print("Enter your MCA percent: ");
       Float per = input.nextFloat();
       System.out.println("My percent in MCA is: " + per);
       
       input.close();



    }
    
}
