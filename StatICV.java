class Student {
    public static int roll_no;
    public static String Name;

}
public class StatICV {
    public static void main(String[] args) {
        Student.Name="Rojesh Shrestha.";
        Student.roll_no=1;

        System.out.println("Student Name: "+Student.Name);
        System.out.println("Roll No: "+Student.roll_no);
    }
}
