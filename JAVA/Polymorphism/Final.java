package Polymorphism;

import java.util.Scanner;

public class Final {
    Scanner sc=new Scanner(System.in);
    final long PAN_NUMBER;

    Final(){
        PAN_NUMBER=1285435555;
        System.out.println("Pan number: "+PAN_NUMBER);
    }
    public static void main(String[] args) {
        new Final();
    }
}
