package stringbuilder;

public class ReverseString {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Ayush");
		for(int i=0;i<sb.length()/2;i++) {
			int front=i;
			int back=sb.length()-1-i;
			char frontchr=sb.charAt(front);
			char backchr=sb.charAt(back);
			sb.setCharAt(front, backchr);
			sb.setCharAt(back, frontchr);
		}
		System.out.println(sb);
		String firstName="Ayush";
		for(int i=firstName.length()-1;i>=0;i--) {
			System.out.print(firstName.charAt(i));
		}
		System.out.println();
	}

}
