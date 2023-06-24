import java.util.Scanner;

class Detail{
   

    public static void main(String[] args) {
         int roll_no;
        String name, address;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Your name: ");
        name=sc.nextLine();

        System.out.println("Enter your roll: ");
        roll_no=sc.nextInt();

        //consumes the remaining newline character
        
        sc.nextLine();

        System.out.println("Enter Your address: ");
        address=sc.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Roll number: "+roll_no);

        sc.close();

    }
}