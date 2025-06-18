package arrays;

public class OddNumber {
	public static void checkOdd(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]+" is a oddnumber");;
			}
		}
	}

	public static void main(String[] args) {
	int []arr= {1,3,4,5,6,7,8,99,2};
	checkOdd(arr);
	}

}
