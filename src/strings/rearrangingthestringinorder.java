package strings;

import java.util.*;

public class rearrangingthestringinorder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = new String();
		s = sc.nextLine();
		int []ch  = new int[s.length()];
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++) {
			ch[i] = (int)s.charAt(i);
		}
		Arrays.sort(ch);
//		for(int ele: ch) {
//			System.out.print(ele + " ");
//		}
		for(int i = 0;i<s.length();i++) {
			char c = (char)(ch[i]);
			sb.append(c);
		}	
		System.out.println(sb + " ");
		
		
		
	}
}
