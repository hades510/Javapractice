package Polymorphism;

class Add{
     int add(int a, int b){
        return(a+b);
    }
     int add(int a, int b, int c){
        return(a+b+c);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Add number=new Add();
        System.out.println("Addition of two numbers: "+number.add(5, 05));
        System.out.println("Addition of three numbers: "+number.add(5, 05, 05));
    }
}
