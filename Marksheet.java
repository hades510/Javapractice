import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        String name;
        int roll_no;
        float percentage;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name: ");
        name=sc.nextLine();
        System.out.println("Enter the roll number: ");
        roll_no=sc.nextInt();
        System.out.println("Enter the percentage: ");
        percentage=sc.nextFloat();

        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll_no);
        System.out.printf("Percentage: %.2f",percentage);
        sc.close();
    }
}
