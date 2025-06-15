package arrays;
import java.util.Scanner;

public class TwoDArrayNoSearching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]arr=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("enter value to search:");
		int val=sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==val) {
					System.out.println("the value was found at index:"+"["+i+","+j+"]");
				}
			}
	}
}
}
