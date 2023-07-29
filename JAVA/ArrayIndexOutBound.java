public class ArrayIndexOutBound {
   
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Element at index 0: " + numbers[0]);
            System.out.println("Element at index 1: " + numbers[1]);
            System.out.println("Element at index 2: " + numbers[2]);

            // Trying to access an element at an invalid index
            System.out.println("Element at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

//to define the size of array use:
/*
    int[] numbers= new int[5];
    here int can only hold 5 elements i.e(0-4)
 */
