package strings;

public class removeconsecutivestrings {
	public static void main(String[] args) {
		String s = "aabaa";
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		int j = 1;
		while(j<s.length()) {
			if(s.charAt(i) == s.charAt(j)) j++;
			else {
				sb.append(s.charAt(i));
				i =j;
			}
		}
		sb.append(s.charAt(i));
		System.out.println(sb);
	}
}
