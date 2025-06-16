package basic;
import java.util.Scanner;
public class SpyNoMtoN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++) {
			int sum=0,prod=1,temp=i;
			while(temp!=0) {
				int rem=temp%10;
				sum+=rem;
				prod*=rem;
				temp/=10;
			}
			if(sum==prod) {
				System.out.println(i+" is spy number");
			}
		}

	}

}
