package strings;
import java.util.*;
public class reverseeachwordoftheString {
		public static void reverse(StringBuilder sb,int i,int j) {
			while(i<=j) {
				char temp = sb.charAt(i);
				  sb.setCharAt(i, sb.charAt(j));
				  sb.setCharAt(j,temp);
				  i++;
				  j--;
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		int i =0,j=0;
		int n = sb.length();
		while(j<n) {
			if(sb.charAt(j) != ' ') j++;
			else {
				reverse(sb,i,j-1);
				i = j+1;
				j = i;
			}
			
		}
		reverse(sb, i, j-1);
		System.out.println(sb + " ");
		
	}
}
