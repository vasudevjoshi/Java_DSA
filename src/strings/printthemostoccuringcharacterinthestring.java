package strings;
import java.util.*;
public class printthemostoccuringcharacterinthestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		int []freq = new int[26];
		for(int i = 0;i<sb.length();i++) {
			if(sb.charAt(i)>='a' && sb.charAt(i)<= 'z') {
				freq[sb.charAt(i)-'a']++;
			}
		}
		int maxfreq = -1;
		for(int i =0;i<freq.length;i++) {
			maxfreq = Math.max(maxfreq,freq[i]);
		}
		for(int i = 0;i<freq.length;i++) {
			if(maxfreq == freq[i]) {
				System.out.print((char)(i+97) + " ");
			}
		}
	}
}
