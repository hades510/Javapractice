package operators.InStance_of_operators;
class ParentClass {

}
interface Myinterface {

}
class ChildClass extends ParentClass implements Myinterface {

}


public class InStance {
    public static void main(String[] args) {
        //creating obj of parent
        //and the child class
        
        ParentClass obj1 = new ParentClass();
        ChildClass obj2 = new ChildClass();
        

        //Comparing the obj to specified type
        System.out.println("obj1 is instance of ParentClass = "+ (obj1  instanceof ParentClass));
        System.out.println("obj1 is instance of ParentClass = "+ (obj1  instanceof ChildClass));
        System.out.println("obj1 is instance of ParentClass = "+ (obj1  instanceof Myinterface));
        System.out.println("obj1 is instance of ParentClass = "+ (obj2  instanceof ChildClass));
        System.out.println("obj1 is instance of ParentClass = "+ (obj2  instanceof ParentClass));
        System.out.println("obj1 is instance of ParentClass = "+ (obj2  instanceof Myinterface));
    }
}
