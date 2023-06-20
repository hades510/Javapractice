package Methods_inJava.User_defined;

import java.util.Scanner;

public class Noargs_retval {
    static int sum(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=a+b;

        return sum;
        //here it return the sum of two numbers.

    }
    public static void main(String[] args) {
        int add=sum();
        System.out.println(add);
    }
}
