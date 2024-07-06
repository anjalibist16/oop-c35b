public class ParseParsingMethod{
    public static void main(String[]args){
        // parse a string into an integer 
        int x = Integer.parseInt("11");
        // parse a String into a double 
        double c = Double.parseDouble("11");
        // parse a string in binary format into an integer 
        int b = Integer.parseInt("100",2);
        // print the result to the console 
        System.out.println(Integer.parseInt("11"));
        System.out.println(Double.parseDouble("11"));
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("101", 8));
    }

}