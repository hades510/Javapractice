
import java.util.Scanner;

class OpeRators {
    char OP;
    float num1,num2;
    float result;
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sign = null;
        try {
            sign = new Scanner(System.in);
            OpeRators obj = new OpeRators();

            System.out.println("Choose the operator: ");
            obj.OP=sign.next().charAt(0);//for scanning character data type.

            System.out.println("Enter the first number: ");
            obj.num1=sign.nextFloat();

            System.out.println("Enter the second number: ");
            obj.num2=sign.nextFloat();

            switch (obj.OP) {
                case '+':
                    obj.result=obj.num1+obj.num2;
                    System.out.println(obj.num1+"+"+obj.num2+"="+obj.result);
                    
                    break;

                case '-':
                    obj.result=obj.num1-obj.num2;
                    System.out.println(obj.num1+"-"+obj.num2+"="+obj.result);
                    break;

                case '*':
                    obj.result=obj.num1*obj.num2;
                    System.out.println(obj.num1+"*"+obj.num2+"="+obj.result);
                    break;

                case '/':
                    obj.result=obj.num1/obj.num2;
                    System.out.println(obj.num1+"/"+obj.num2+"="+obj.result);
                    break;

                case '%':
                     obj.result=obj.num1%obj.num2;
                    System.out.println(obj.num1+"%"+obj.num2+"="+obj.result);
                    break;
            
                default:
                    System.out.println("INVALID OPERATORS!!!");
                    break;
            }

        }catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
        finally {
            if(sign !=null) {
                sign.close();
            }
        }
    }
}
