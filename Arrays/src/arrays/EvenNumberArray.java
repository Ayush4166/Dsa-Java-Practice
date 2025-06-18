package arrays;

import java.util.Scanner;

public class EvenNumberArray {
	public static void evenNumber(int[]a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" is a even number");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter element:");
			arr[i]=sc.nextInt();
		}
		evenNumber(arr);
		

	}

}
