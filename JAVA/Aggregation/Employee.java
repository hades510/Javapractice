package Aggregation;

public class Employee {
    int id;
    String name;
    Address addres;

    Employee(String name, int id,Address addres){
        this.id=id;
        this.name=name;
        this.addres=addres;
    }
    void display(){
         System.out.println(name+" "+id);
        System.out.println(addres.city+" "+addres.province);
    }
    public static void main(String[] args) {
        Address addres1=new Address("Kathmandu",3);
        Address addres2=new Address("Kathmandu",3);

        Employee em=new Employee("Rojesh Shrestha",21,addres1);
        Employee em2=new Employee("Rabina Shrestha",22,addres2);

        em.display();
        em2.display();
    }
}
