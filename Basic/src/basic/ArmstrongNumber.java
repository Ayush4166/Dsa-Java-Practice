package basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int temp=n;
		int temp1=n;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		System.out.println("Number of digit are:"+count);
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod=prod*rem;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if(sum==temp1) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong no");
		}
	}

}
