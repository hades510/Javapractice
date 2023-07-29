public class AddFnLocalV {
    public void add() {//if we use static we son't have to use object
    
        int num1,num2,num3;
        num1=5;
        num2=10;
        num3=num1+num2;
        System.out.println(num3);
    }
    public static void main(String[] args) {
        AddFnLocalV object = new AddFnLocalV();
        object.add();
    }
}
