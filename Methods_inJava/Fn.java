package Methods_inJava;
import java.util.Scanner;

class Fn {
public static void main(String[] args) {
    //here main is the caller
    Scanner sc = new Scanner(System.in);
    int x =sc.nextInt();
    int y =sc.nextInt();
    
    //function method calling
    //this is called entry p0int

    int z =findsum(x, y);//this shifts the control to findsum fn
    
    System.out.println("First call Fn: "+z);
    if (x>y) {
        int g =findsum(x, y);
        System.out.println("Sceond condition call Fn: "+g);
    } else {
        
    }
}

//Function
static int findsum(int a, int b){
    //here callee is findsum
    int sum =a+b;
    return sum;
}
}