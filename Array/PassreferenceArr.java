package Array;

import java.util.Scanner;

class PassreferenceArr {
    static void print(int[] arr){
        int i;
        Scanner sc =new Scanner(System.in);
         
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       int [] arr=new int[5];
       print(arr);
        
    }
}