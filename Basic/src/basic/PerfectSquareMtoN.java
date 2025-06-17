package basic;

import java.util.Scanner;

public class PerfectSquareMtoN {
	public static void perfectSq(int m,int n) {
		for(int i=m;i<=n;i++) {
			boolean res=false;
			for(int j=1;j*j<=i;j++) {
				int sq=j*j;
				if(sq==i) {
					res=true;
					break;
				}
			}
			if(res==true) {
				System.out.println(i+" is a perfect Square");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		perfectSq(m, n);

	}

}
