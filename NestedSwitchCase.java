public class NestedSwitchCase {
    public static void main(String[] args) {
        int year = 3;
        int marks = 80;

        switch (year) {
            case 1: 
                System.out.println("First year student");
                break;
            case 2: 
                System.out.println("Second year student");
                break;
            case 3: 
                switch (marks) {
                    case 50: 
                        System.out.println("You are not eligible ");
                        break;
                    case 80: 
                        System.out.println("Congratns !!!! you are eligible for scholarship ");
                        break;
                    default: 
                        System.out.println("Please enter valid year");
                }
                break; // added break to terminate case 3 after nested switch
            default: 
                System.out.println("Invalid year");
        }
    }
}


//euta switch case vitra arko switch case chha bhane teslai nested switch  case statement bhanincha 