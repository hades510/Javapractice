import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		int s=sc.nextInt();//searching number;
		int x=-1;//postition of the number in the array
		

		for (int i = n-1;i>=0; i--) {
			if (arr[i]==s) {
				x+=i+1;
			}
		}System.out.println(x);
	}
}
