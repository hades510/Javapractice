abstract class Abstract{
abstract void run();//abstract method 
}
class Honda extends Abstract{
    void run(){
        System.out.println("It's working");
    }
    public static void main(String[] args) {
        Abstract a=new Honda(); //upcasting abstract class with non abstract class.
        a.run();
    }
}
/*Here,I created an abstract class with an abstract method 
whose implementation is given in it's non abstract child class honda.
 * 
 */