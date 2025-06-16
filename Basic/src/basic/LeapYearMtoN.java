package basic;
import java.util.Scanner;

public class LeapYearMtoN {
	public static void checkLeap(int m,int n) {
		for(int i=m;i<=n;i++) {
			if(i%4==0 && (i%400==0 || i%100!=0)) {
				System.out.println(i+" is a Leap Year");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		checkLeap(m, n);
	}

}
