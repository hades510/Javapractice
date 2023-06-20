import java.util.Scanner;
public class LocalVscope {
    void method() {
        Scanner sc = new Scanner(System.in);
        
        int x=5;
        System.out.println(x);
    }
}
/**Variable scopes
 * local variable scope
    defined inside a block,method body 
    or constructor
 *cannot be accessed outside the method.
 *Member/class level variable scope
    variable declared inside a class 
    but, outside the method.
 */