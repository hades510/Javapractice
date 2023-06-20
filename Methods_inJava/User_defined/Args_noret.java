package Methods_inJava.User_defined;

public class Args_noret {
    static void evenodd(int n) {
        if (n%2==0) {
            System.out.println("Even");

        }else {
            System.out.println("odd");

        }
    }
    public static void main(String[] args) {
        int num=24;
        evenodd(num);
    }
    
}
