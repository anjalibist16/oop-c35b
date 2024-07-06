public class NestedForLoop {
    public static void main(String[] args) {
        // Outer loop iterates over rows
        for (int i = 1; i < 5; i++) {
            // Inner loop iterates over columns
            for (int j = 1; j < 5; j++) {
              System.out.println(j + " ");
            }
            System.out.println();
        }
        // Outer loop for the number of rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }


        // Example:ExampleInfiniteLoop.java
        //for (;;){
          //  System.out.println("Hello World");
        //}
        //Note: To stop the infinite loop press ctrl+c


    }
}