package Methods_inJava.User_defined;
 class live {
    static int sum(int a, int b){
        int z;
        z=a+b;
        return z;
    }
    public static void main(String[] args) {
        int num1=25;
        int num2=26;
        int num3=27;
        int num4=30;
        int a=sum(num3, num4);
        int b=sum(num1, num2);
        int c=sum(num2, num3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
