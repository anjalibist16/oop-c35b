public class variableType {
    
        // type of variables example:
        int myVariable;
        static int data = 30;
        void method(){
            int a = 100;
            System.out.println("Variable of local variable" + myVariable);
        }  
        
        public static void main (String args []) {
            variableType obj = new variableType();
            obj.method();
            System.out.println("Variable of instance variable myVariable: " + obj);
            System.out.println("Variable of static variable data: " + data);
        }
}
