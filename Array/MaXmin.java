package Array;

import java.util.Scanner;

public class MaXmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size of array

        int[] arr= new int[n];//declaration
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
           // System.out.println(arr[i]);
           if (arr[i]>max) {
            max=arr[i];
           }
    
        }
        System.out.println(max+" is the largest number");
        int min=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println(min+" is the smallest number");
         

        
        sc.close();
    }
}


