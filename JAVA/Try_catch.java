class Try_catch {

    public static void main(String[] args) {
        try {
            int divide = 5/0;
            System.out.println("Rest of the code:");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("ArihimaticException = "+e.getMessage());
        }finally {
            System.out.println("This is finally block");
        }
    }
}
   