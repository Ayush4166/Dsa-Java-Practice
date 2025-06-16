package basic;
import java.util.Scanner;
//Spy Number is a number whose sum of digit and product of digit is same 
//eg- 1124, sum=1+1+2+4=8,product=1*1*2*4=8 and non-Spy no eg-134 etc.
public class SpyNumber {
	//using sumNo Method to get the sum of digits
	public static int sumNo(int n) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	//using productNo method to Get the product of the digit
	public static int productNo(int n) {
		int prod=1;
		while(n!=0) {
			int rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int n=sc.nextInt();
		
		//Anther way to solve without method is doing in main itself
		/*
		 * int prod=1,sum=0,temp=n; while(temp!=0) { int rem=temp%10; sum+=rem;
		 * prod*=rem; temp=temp/10; }
		 */
		
		int sum=sumNo(n);
		int prod=productNo(n);
		if(sum==prod) {
			System.out.println(n+" it is a Spy No");
		}
		else {
			System.out.println(n+" Not a spy no");
		}
		sc.close();

	}

}
