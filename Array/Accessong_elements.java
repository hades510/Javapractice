package Array;

import java.util.Scanner;

public class Accessong_elements {
    public static void main(String[] args) {
        int[] std=new int[5];
        Scanner sc=null;
        try{
            sc=new Scanner(System.in);
            int i;
            for ( i = 0; i < std.length; i++) {
                std[i]=sc.nextInt();
            }
            System.out.println("Third value: "+std[i]);
        }finally{
            if (sc !=null) {
                sc.close();
            }
        }
    }
}
