public class CommandLine {
    public static void main(String[]args){
        if (args.length < 2 ){

             System.out.println("Please provide your name and asge as a command line arguments. ");
            return; 
        }
    // get name argusment from the command line 
        String name = args[0];
    // get the args argument from the command line and parse it to an integer 
        int age = Integer.parseInt(args[1]);

    // print out a messgae that include the users name 
        System.out.println("Hello, " + name);

    // print out a message that includes the users age 

        System.out.println(" You are " +  age + " Years old ");

    }
}