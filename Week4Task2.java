
        // 2. Write a program that displays the following table (note that 1 mile is
        // 1.609 kilometers):
        // Miles Kilometers
        // 1 1.609
        // 2 3.218
        // … ….
        // 9 14.481
        // 10 16.090
        public class Week4Task2 {
            public static void main(String[] args) {
                // Conversion factor from miles to kilometers
                final double KMPM = 1.609;
        
                // Print table header
                System.out.printf("%-10s %-10s%n", "Miles", "Kilometers");
                System.out.println("--------------------------");
        
                // Loop to print miles and their corresponding kilometers
                for (int miles = 1; miles <= 5; miles++) {
                    double kilometers = miles * KMPM;
                    System.out.printf("%-10d %-10.3f%n", miles, kilometers);
                }
            }
        }
        