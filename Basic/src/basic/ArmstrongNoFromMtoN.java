package basic;

import java.util.Scanner;

public class ArmstrongNoFromMtoN {
	
	public static boolean checkArmstrong(int i) {
		int count=0;int temp=i;int temp1=i;int sum=0;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		while(temp1!=0) {
			int rem=temp1%10;
			int prod=1;
			for(int j=1;j<=count;j++) {
				prod=prod*rem;
			}
			sum=sum+prod;
			temp1/=10;
		}
		return sum==i;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++) {
			if(checkArmstrong(i)) {
				System.out.println(i+" is a armstrong");
			}
		}
		
		//we will use method to make more clean code
		
		
		
		/*
		 * for(int i=m;i<=n;i++) { int count=0,temp=i,temp1=i; while(temp!=0) { count++;
		 * temp=temp/10; } int sum=0; while(temp1!=0) { int rem=temp1%10; int prod=1;
		 * for(int j=1;j<=count;j++) { prod=prod*rem; } sum=sum+prod; temp1=temp1/10; }
		 * if(sum==i) { System.out.println(i+" is armstrong number"); } }
		 */
	}

}
