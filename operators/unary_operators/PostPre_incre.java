package operators.unary_operators;
public class PostPre_incre {
    public static void main(String[] args) {
        
        int x = 35;
        //Post increment
        /*First it will print 35,
         * then number is incremented to 
         36.
         */
        System.out.println("Number1: "+ x++);

        //Pre increment
        /*
         * Since the increment to 36,
         * it is again incremented to 37,
         * Then, gets printed.
         */
        System.out.println("Number2: "+ ++x);


        //post decrement
        /*
         *number is 37, 37 is printed and gets
         decremented to 36.
         */
        System.out.println("Number3: "+ x--);
        //pre decrement
        /*number is 36, gets decremented to 35,
        then gets printed.
         */
        System.out.println("Number4: "+ --x);
    }
}
