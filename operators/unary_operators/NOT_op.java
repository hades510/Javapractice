package operators.unary_operators;

public class NOT_op {
    public static void main(String[] args) {
        int a = 20, b = 50;

        //Without "NOT operator"
        System.out.println("(a<b)="+(a<b));

        //Using "Not operator"
        System.out.println("(a<b)="+ !(a<b));
    }
}
