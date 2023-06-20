package Control_statements;

public class Labeled_break {
    public static void main(String[] args) {
        boolean b = true;

        first: {
            second: {
                third: {
                    System.out.println("Before the break statement ");
                    //break will take the control out
                    //of the second label
                    if (b)
                    break second;
                    System.out.println("Third");
                }
                System.out.println("second");
            }
            System.out.println("first");
        }
    }
}
