class foat {
    static float x = 22/7f;//should keep those f
    

}
class duble {
    static double y= 22.0/7.0;//should keep those .0
}

public class IntC {
    public static void main(String[] args) {
        System.out.println("FLOAT: "+foat.x);
        System.out.println("DOUBLE: "+duble.y);
    }
}