package strings;
import java.util.*;
/*Input a string and toggle all the characters in a String ( change the lowercase to uppercase and vice versa)*/
public class togglestrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int diff = 'a' - 'A';
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0;i<sb.length();i++) {
			if(sb.charAt(i)>='a' && sb.charAt(i)<='z' ) {
					int c = sb.charAt(i);
					sb.setCharAt(i,(char)(c - diff));
				}
			else	/*if(sb.charAt(i)>='A' && sb.charAt(i)<='Z' ) */{
				int c = sb.charAt(i);
				sb.setCharAt(i,(char)(c + diff));
			}
			}
		System.out.println(sb);
		}
	}

