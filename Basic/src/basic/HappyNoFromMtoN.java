package basic;

import java.util.Scanner;

public class HappyNoFromMtoN {
	public static void happyNo(int m,int n) {
		for(int i=m;i<=n;i++) {
			int temp=i;
			while(temp!=1 && temp!=4) {
				int sum=0;
				while(temp!=0) {
				int rem=temp%10;
				sum=sum+(rem*rem);
				temp/=10;
			}
			temp=sum;
			}
			if(temp==1) {
				System.out.println(i+" is a Happy no");
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		happyNo(m, n);
	}

}
