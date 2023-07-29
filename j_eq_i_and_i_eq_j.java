class j_eq_i_and_i_eq_j{
    public static void main(String[] args) {
        int fib1=1;
        int fib0=0;
        int fib3=3;
        int fib4=4;

        //fib1=fib0
        fib1=fib0;//value of fib0 to fib1
        System.out.println(fib1);
        //fib0=fib1
        fib0=fib1;//value of fib1 to fib0
        System.out.println(fib1);
        //fib3=fib4
        fib3=fib4;//value of fib4 to fib3
        System.out.println(fib3);
    }
}