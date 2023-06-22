package Array;

import java.util.Scanner;

public class Initializing_byloop {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner sc=null;try{
            sc=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt(); 
            System.out.println(array[i]);
        }
    }finally{
        if (sc!=null) {
            sc.close();
        }
    }
}
}
