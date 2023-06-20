class OvErflow {

    public static void main(String[] args) {
        int overflow=2147483647;
        int underflow=-2147483648;
        //overflow
        System.out.println("overflow: "+(overflow + 1));
        //(overflow + 1)mean increment

        //underflow
        System.out.println("Underflow: "+(underflow - 1));
        //(underflow - 1)means decrement
        
    }
}