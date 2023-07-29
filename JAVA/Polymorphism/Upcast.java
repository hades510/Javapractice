package Polymorphism;

public class Upcast {
    void eat(){
        System.out.println("eating");
    }
}class Dog extends Upcast {
    void eat(){
        System.out.println("barking");
    }
}class Babydog extends Dog {
    void eat(){
        System.out.println("sleeping");
    }
    public static void main(String[] args) {
        Upcast a=new Dog();//upcasting
        a.eat();//upcast call
        a=new Babydog();//upcasting
        a.eat();
    }
}
