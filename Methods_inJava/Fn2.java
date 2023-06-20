package Methods_inJava;
import java.util.Scanner;
public class Fn2 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int y=Greater(a, b);
        System.out.println("it is greater: "+y);
    }
    static int Greater(int x, int w) {
        if (w>x) {
            return w;
        } else {
            return x;
        }
    }
}
