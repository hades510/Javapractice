package Polymorphism;

public class Dynamic_binding {
    void eat(){
        System.out.println("EAting");
    }
}
class Animal extends Dynamic_binding{
    void eat(){
        System.out.println("Chewing");
    }
     
    public static void main(String[] args) {
        Dynamic_binding a=new Animal();
        a.eat();
    }
}
 
