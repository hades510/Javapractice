package Methods_inJava.User_defined;

public class pass_by_value {
    static void increase(int x, int y) {
        ++x;
        x++;

        y=y+2;
        //here x and y are formal parameters.
        System.out.println(x+":"+y);
    }
    public static void main(String[] args) {
        int a=20;
        int b=25;
        //here a and b are actual parameters.
        increase(a, b);
        System.out.println(a+":"+b);
    }
}
