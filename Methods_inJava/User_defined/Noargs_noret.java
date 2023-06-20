package Methods_inJava.User_defined;
import java.util.Scanner;

public class Noargs_noret {
    static void checkEvenOdd() {
   /*Here, we write the code as the body 
   of the function. */ 
   Scanner sc =null;
   try{ sc=new Scanner(System.in);
   int num=sc.nextInt();
   if (num % 2==0) {
    System.out.printf("%d is Even number",num);

   } else {
    System.out.printf("%d is Odd number.",num);
   }

    }finally{
        if (sc !=null) {
           sc.close(); 
        }
    }
}
    public static void main(String[] args) {
        //function call
        checkEvenOdd();
    }
}
