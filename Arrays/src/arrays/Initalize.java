package arrays;
import java.util.Scanner;
public class Initalize {

	public static void main(String[] args) {
		// Syntax type[]ArrayNamme =new type[size];
		
		//this is declaration of array
		//int []marks=new int[3];
		
		//initalizeing array
		/*
		 * marks[0]=97; marks[1]=98; marks[2]=99;
		 * 
		 * System.out.println(marks[0]); System.out.println(marks[1]);
		 * System.out.println(marks[2]);
		 */
		
		//this was making our code more big lets use for loop for taking input and printing output
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrays:");
		int size=sc.nextInt();
		int []marks=new int[size];
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(marks[i]);
		}
		

	}

}
