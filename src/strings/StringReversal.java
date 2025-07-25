package strings;
/*Reversing of the Stirng without using inbuilt function*/
import java.util.*;
public class StringReversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		int n = sb.length();
		for(int i = 0;i<n/2;i++) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(n-1-i));
			sb.setCharAt(n-1-i,temp);
		}
		System.out.println(sb + " ");
	System.out.println(sb + " ");
	}
}
