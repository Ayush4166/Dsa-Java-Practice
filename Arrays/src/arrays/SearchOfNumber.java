package arrays;
import java.util.Scanner;


public class SearchOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the array element:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the key to search:");
		int key=sc.nextInt();
		//length funtion is used when we dont take any size varible
		for(int i=0;i<size;i++) {
			if(arr[i]==key) {
				System.out.println("Key foun at index:"+i);
			}
		}
	}

}
