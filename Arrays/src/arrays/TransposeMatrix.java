package arrays;
import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row of matrix:");
		int r=sc.nextInt();
		System.out.println("Enter the column of matrix:");
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
		//Printing Transpose
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	

}
