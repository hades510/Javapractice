package Array;

import java.util.Scanner;

public class Add2Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //declaration of array
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        int sum=0;
        int  i,j;
        
        //scanning of arr1
        for ( i = 0; i < n; i++) {
            arr1[i]=sc.nextInt();
            sum+=arr1[i];
        }
        //scanning of arr2
        for ( j = 0; j < m; j++) {
            arr2[j]=sc.nextInt();
           sum+=arr2[j];
        }
       
       System.out.println(sum);
        sc.close();
    }
}
