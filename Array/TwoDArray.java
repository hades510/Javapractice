package Array;

public class TwoDArray {
   public static void main(String[] args) {
    int [][] arr= {
                    {2,3,4},
                    {4,5,6}
    };

    for (int i = 0; i < arr.length; i++) {//for row
        for (int j = 0; j < arr.length; j++) {//for column
            System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
        }
    }
   } 
}
