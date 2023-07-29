package Polymorphism;

class School{
    String Address="Ganabahal,kathmandu";
}
class Student extends School{
    String Address="Ombahal,kathmandu";

    void printAddress(){
        System.out.println(Address);//prints student address
        System.out.println(super.Address);//prints school address
    }
}
class Super{
    public static void main(String[] args) {
        Student s=new Student();
        s.printAddress();
    }
}