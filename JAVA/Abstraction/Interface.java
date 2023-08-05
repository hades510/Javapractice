interface Print{
    void run();
}
 class Interface implements Print {
     
          public void run(){
             System.out.println("Printing"); 
          }
     public static void main(String[] args) {
    Print obj=new Interface();//upcasting
    obj.run();
  }  
}
