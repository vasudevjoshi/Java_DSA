package strings;

public class compressthestring {
		public static void main(String[] args) {
			StringBuilder sb = new StringBuilder("");
			int i = 0;
			int j = 0;
			int n = .length();
			int len = 0;
			int count = 0;
			while(j<n) {
				if(s.charAt(i) == s.charAt(j)) {count++; j++;}
				else {
					sb.append(s.charAt(i));
					sb.append(count);
					i = j;
					count = 0;
				}
			}
			sb.append(s.charAt(i));
			sb.append(count);
			System.out.println(sb);
			System.out.println(sb.length());
		}
}
