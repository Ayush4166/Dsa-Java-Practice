package arrays;

public class AcendingOrderSorting {

	public static void main(String[] args) {
		boolean result=true;
		int []arr= { 1, 2, 4, 7 };
		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=i;j<arr.length;j++) {
		 * if(arr[i]>arr[j]) { result=false; } } }
		 */
		//previous we took 2 loop which will create O(n^2) time lets do the same in less time
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				result=false;
				break;
			}
		}
		if(result) {
		System.out.println("Array in acssending order");
	}
		else {
			System.out.println("not assending");
		}
	}

}
