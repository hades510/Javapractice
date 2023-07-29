package Array;

import java.util.Scanner;



public class Searching_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //declaration of array
        int[] arr=new int[n];

  
        //scanning arr
        for ( int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
        int s=sc.nextInt();//element to be searched in the array

        //searching
        for (int i : arr) {//here int i is a loop varible declaration
            //after: we specify the array to iterate ,which is 'arr'in this case 
            if (i==s) {
                System.out.println(s+" is in the array");
            }
        }
        sc.close();
    }

    // static int search(int[] arr, int length, int s) {
      
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i]==s) {
    //             return 1;
    //         }
    //         return -1;
    //     }
        
    // }
}
