abstract class AbstractEx {
    AbstractEx()//constructor
    {
        System.out.println("Abstract is working");
    }
    abstract void run();{
        System.out.println("Abstract call");
    }
    void check(){
        System.out.println("Non Abstract checking");
    }

}
class Abstract01 extends AbstractEx{
    void run(){
       // System.out.println("Fine");
    }
} 
class Test{
    public static void main(String[] args) {
        AbstractEx ab=new Abstract01();
        ab.run();
        ab.check();
    }
}/*Here, the output is
Abstract call
Abstract is working
fine
Non Abstract checking */
