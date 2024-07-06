public class JumpContinueLoop {
    public static void main(String[] args) {
        //for (int i = 1; i <= 6; i++) {
         //   if (i == 4)
             //   continue;
            //System.out.println(i);

            // it skip 4
        //}

        // Example 2: ContinueInLoop.java(Nested Loop)
int i = 1, j =1;
// outer loop
while (i <= 3) {
    System.out.println("Outer loop: " + i);
    // inner loop
    while (j <= 3) {
        if (j==2){
            j++;
            continue;
        }
        System.out.println("Inner loop: " + j);
        j++;
    }
    i++;
    }
    }
}
