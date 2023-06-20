package operators.Conditional_operators;

public class ConDitional {
    public static void main(String[] args) {
        //variable = exp1 ? exp2 : exp3

        int a=50,b=100;
        int min;

        //Print a and b
        System.out.println(a);
        System.out.println(b);

        //Find minimum number
        min=(a<b)?a:b;
        /*Here (a<b) is exp1 which is if "true"
         * then exp2 is evaluted
         * if "False"
         * exp3 is evaluated
         */

        //print min
        System.out.println(min);
    }
}
