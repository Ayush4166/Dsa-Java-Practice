package basic;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		boolean f=false;
		for(int i=1;i<=n/2;i++) {
			int sq=i*i;
			if(sq==n) {
				f=true;
				break;
			}
		}
		if(f==true) {
			System.out.println("Perfect square");
		}
		else {
			System.out.println("Not perfect square");
		}

	}

}
