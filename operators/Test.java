package operators;

public class Test {

    static int add(int a,int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
       int A=add(1, 02, 03);
       int C=add(5, 5);
       int B=add(8, 7);
       System.out.println(A+" "+B+" "+C);
    }
    
}
