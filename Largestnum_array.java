import java.util.Scanner;

public class Largestnum_array {
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the limit of the array: ");
    int n=sc.nextInt();
    //initialization of array
    int [] arr=new int[n];

    System.out.println("Enter the integers: ");
    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
         
       
    }
    int max=arr[0];//assume it is the largest number
    for (int i = 1; i < arr.length; i++) {
        if (arr[i]>max) {
            max=arr[i];//upadating the value of max if found greater than it
        } 
    }
    System.out.println("The largest number is : "+max);
    
 sc.close();   
}
}
