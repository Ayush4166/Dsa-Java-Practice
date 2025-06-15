package arrays;
import java.util.Scanner;
public class SpiralOrderMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter szie of Row:");
		int row=sc.nextInt();
		System.out.println("enter size of Column:");
		int col=sc.nextInt();
		int[][]arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//we will try to print output in spiral order
		System.out.println("now spiral matrix is:");
		int Srow=0;
		int Erow=row-1;
		int Scol=0;
		int Ecol=col-1;
		while(Srow<=Erow && Scol<=Ecol ) {
			//1st top boundry left to right
			for(int i=Scol;i<=Ecol;i++) {
				System.out.print(arr[Srow][i]+" ");
			}
			Srow++;
			//2nd right boundry
			for(int i=Srow;i<=Erow;i++) {
				System.out.print(arr[i][Ecol]+" ");
			}
			Ecol--;
			//3rd Bottom boundry End col to start col
			for(int i=Ecol;i>=Scol;i--) {
				System.out.print(arr[Erow][i]+" ");
			}
			Erow--;
			//4th left boundry End row to 
			for(int i=Erow;i>=Srow;i--) {
				System.out.print(arr[i][Scol]+" ");
			}
			Scol++;
		}
		

	}

}
