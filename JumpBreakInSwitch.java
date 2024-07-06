import java.util.Scanner;
public class JumpBreakInSwitch {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Select a fruit: ");
            System.out.println("1. Apple ");
            System.out.println("2. Grapes ");
            System.out.println("3. Exit ");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                System.out.println("You have selected Apple");
                break;
                case 2:
                System.out.println("You have selected Grapes");
                break;
                case 3:
                System.out.println("You have selected Exit");
                sc.close();
                return;
                default:
                System.out.println("Invalid choice");
                break;
            }
        }
    }
    
}
