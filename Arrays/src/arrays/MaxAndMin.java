package arrays;
import java.util.Scanner;
public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the value of array:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Minimum element in array is:"+min);
		System.out.println("Maximum elemnet in arrat is:"+max);
	}

}
