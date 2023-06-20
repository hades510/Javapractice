public class Product {
    public int Product (int num1, int num2, int num3){
        return(num1*num2*num3);
    }
    public static void main(String args[]) {
        Product obj = new Product();
        int result =obj.Product(5,5,5);

        System.out.println("Product are:"+result);
    }
}
