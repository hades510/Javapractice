import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fib0=0;
        int fib1=1;
        System.out.println("Enter the number to where the series is continued: ");
        int num=sc.nextInt();
        System.out.println(fib0);
        System.out.println(fib1);

        for (int i = 0; i < num; i++) {
           int fib_n=fib0+fib1;
           fib0=fib1;
           fib1=fib_n;
           System.out.println(fib_n);

            
        }

        sc.close();
    }

}
