public class Inheritance {//method overriding
    
    int myInterest(){
        return 0;
    }
}
class SBI extends Inheritance{
    int myInterest(){
        return 7;
    }
}
class NIMB extends Inheritance{
    int myInterest(){
        return 8;
    }
}
class Bank{
    public static void main(String[] args) {
        SBI s=new SBI();
        NIMB n=new NIMB();
        System.out.println("SBI INTEREST RATE: "+s.myInterest());
        System.out.println("NIMB INTEREST RATE: "+n.myInterest());
    }
}
