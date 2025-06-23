package stringbuilder;
import java.util.Scanner;
public class WordReverse {
	public static String wordRev(String wrd) {
		String []word=wrd.trim().split("\\s+");
		StringBuilder sb=new StringBuilder();
		for(int i=word.length-1;i>=0;i--) {
			sb.append(word[i]);
			if(i!=0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string:");
		String wrd=sc.nextLine();
		System.out.println(wordRev(wrd));
	}

}
