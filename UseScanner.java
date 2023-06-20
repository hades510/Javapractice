import java.util.Scanner;
class Addition {
   static int x,y,z;
}
public class UseScanner {
    public static void main(String[] args) {
        //Creating an obj for Scanner class
        Scanner adam = null;//here,it is done to prevent resource leak!!!
        
        try {
        adam = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        Addition.x = adam.nextInt();

        System.out.print("Enter the Second number: ");
        Addition.y =adam.nextInt();

        Addition.z=Addition.x+Addition.y;

        System.out.print("Sum of x and y: "+Addition.z);
        }finally {
            if (adam != null) {
                adam.close();
                
            }
        }
    }
}
//adam is the object of Scanner

