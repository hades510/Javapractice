package operators.Logical_and_bitwise;

public class BitWise {
    public static void main(String[] args) {
       //AND bitwise operators
       int a = 6;//Binary form is 0110
       int b = 7;//Binary form is 0111
       int c = 240;//Binary form is 11110000
       System.out.println("a & b = "+(a&b));
       //Result=6
       /*
        * 1 & 1 =1
        * 1 & 0 =0
        */

        //OR bitwise operators
        System.out.println("a | b= "+(a|b));
        //Result=7

        //NOT operators
        System.out.println("~a = "+ ~a);
        /*
         * ~1=0
         * ~0=1
         */

         //XOR bitwise operators
         System.out.println("a ^ b = "+(a^b));
         //Result=1
         /*
          * 1^1=0
          * 1^0=1
          * 0^0=0
          */

          //Left shift operators
          
          System.out.println("b<<2="+(b<<2));
          //Left shift means append number of 
          //0's to right. 0 1 1 1 0 0= 28

          //Right shift operators

          System.out.println("b>>2="+(b>>2));
          //Right shift means remove
          //the number of 0's to the right. 
          //0 1=1

          //REMEMBER LEFT AND RIGHT SHIFT
          //should not be used on -ve numbers

          //UNSIGNED right shift operator
          System.out.println("c>>>2="+(c>>>2));
          //Unsigned right shift means remove
          //number of bits to right and append
          //into left 0 0 1 1 1 1 0 0 =60.

    }
    
}
