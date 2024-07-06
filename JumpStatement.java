public class JumpStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i == 5)
                break;
            System.out.println("Hello World");
        }

        // example 2
        int i = 1;
        do {
            if (i == 5) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        } while (i <= 7);
        // example 3
        a: for (int r = 0; i <= 10; r++) {
            b: for (int j = 0; j <= 15; j++) {
                c: for (int k = 0; k <= 20; k++) {
                    System.out.println(k);
                    if (k == 5) {
                        break a;
                    }
                }
            }
        }
       
        
        /
    }

}
