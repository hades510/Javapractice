class MemberClassVscope_demo{
    //variable defined inside the class
    int x;
}
public class MemberClassVscope {
   public static void main(String[] args) {
    //creating memberclassvscope_demo class object
    MemberClassVscope_demo obj =new MemberClassVscope_demo();
    //assinging values to the variable
    obj.x=5;
    System.out.println(obj.x);
   }
}
