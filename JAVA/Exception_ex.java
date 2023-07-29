public class Exception_ex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try {
            int x = arr[5];
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
