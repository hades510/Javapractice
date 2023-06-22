package Garbage_collection;

public class System_gc {
    public static void main(String[] args) {
        System_gc obj1 = new System_gc();
        System_gc obj2 = new System_gc();
        //nullifiying ref.variable
        obj1=null;
        //requesting JVM for garbage collection
        System.gc();

        //nullifiying ref.variable 
        obj2=null;
        //requesting JVM for garbage collection
        Runtime.getRuntime().gc();
    }   
    @Override
    // finalize method is called on object once
    //before garbage collecting it
    protected void finalize() throws Throwable{
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected :"+this);
    }
}
