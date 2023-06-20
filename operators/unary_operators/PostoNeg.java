package operators.unary_operators;
public class PostoNeg {
    
    public static void main(String[] args) {
        int x = 1;
        x = -x; 
        System.out.println("Negative Value: "+x);
        
        int y = -35;
        y=-y;//logic is  ('-' * '-' = '+')
        System.out.println("Positive value: "+y);
    }

}
