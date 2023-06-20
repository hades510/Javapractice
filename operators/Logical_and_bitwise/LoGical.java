package operators.Logical_and_bitwise;

public class LoGical {
    public static void main(String[] args) {
        int a = 25, aa = 5, aaa = 15;

    //And operator
    System.out.println((aa>a)&&(aaa>a));//false
    System.out.println((a>aa)&&(a>aaa));//true

    //OR operator
    System.out.println((aa<a)||(aaa>a));//true
    System.out.println((a<aa)||(a<aaa));//false

    //NOt operator
    System.out.println( a!=aa);//true
    }
}
