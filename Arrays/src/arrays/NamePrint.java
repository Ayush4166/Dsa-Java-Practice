package arrays;
import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		String names[]=new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the name:");
			names[i]=sc.next();
		}
		for(int i=0;i<size;i++) {
			System.out.println(names[i]);
		}
		
	}

}
