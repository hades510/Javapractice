package Methods_inJava.User_defined;
import java.util.Scanner;

public class Args_retval {
    //Funcion declaration
    static String checkEvenodd(int N) {
       //Function defination
        if (N % 2 ==0) {
            return "Even";
        } else {
            return "odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc=new Scanner(System.in);
            System.out.println("Enter the number to be tested: ");
            int number=sc.nextInt();
            // Function call
           
           //Here, fn is string declaration,so result has to be string.
            String result=checkEvenodd(number);
            System.out.println(result);
            
            int number1=25;
            String result1 =checkEvenodd(number1);
            System.out.println(result1);

        }finally{
            if (sc !=null) {
                sc.close();
            }
        }
        
    }
}
