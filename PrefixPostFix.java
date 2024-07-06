public class PrefixPostFix {
    public static void main (String[] args) {
        int prefixValue = 10;
        System.out.println("Prefix will update here " + ++prefixValue);
        System.out.println("It will remain the same " + prefixValue);
        /* Prefix is when you put operator in the left siden of value/var */
        // prefix - ++x


        int postFixValue = 20;
        System.out.println("Postfix will not update here " + postFixValue++);
        System.out.println("It will update here " + postFixValue);
        /* PostFix is when you put operator in the right side */
        // X++ // postfix

    }
    
}

    
