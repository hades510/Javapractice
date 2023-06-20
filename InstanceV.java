class Instancs {
    //theses are instance variables.
    //they are declared inside the class
    //but outside the methodbody.
    String name;
    int roll_no;

}
public class InstanceV {
    public static void main(String[] args) {
        //creating Instances class object.
        Instancs instant = new Instancs();

        //Assigning values in its variables.
        instant.name="Rojesh Shrestha";
        instant.roll_no=20;

        System.out.println("NAMe of student: "+instant.name);
        System.out.println("Roll No: "+instant.roll_no);
        
    }
}
