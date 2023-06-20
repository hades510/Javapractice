import java.util.Scanner;

class test {
	 int Reminder(int n){
		int rem=0; 
		while (n>0) {
			 rem=n%10;//finds the remainder

			n=n/10;//updates the number after division.
			System.out.println(rem);
		}
		return rem;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		test obj =new test();
		obj.Reminder(num);
		//int rem;
		//while (num>0) {
		//	rem=num%10;//finds the remainder
//
		//	num=num/10;//updates the number after division.
		//	System.out.println(rem);
		//}
	}
}