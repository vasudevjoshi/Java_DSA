package strings;

public class printthemaximumoftheStrings {
		public static void main(String[] args) {
			String [] arr = {"45645","00323","-89548"};
			String maxS = arr[0];
			for(int i = 1;i<arr.length;i++) {
				maxS = max(maxS,arr[i]);
			}
			System.out.println(maxS);
			
		}
		public static String max(String a,String b) {
			String s = removeleadingzeros(a);
			String t = removeleadingzeros(b);
			if(s.length()>t.length()) return a;
			if(s.length()<t.length()) return b;
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i)!=t.charAt(i)) {
					if(s.charAt(i)<t.charAt(i)) return b;
					else return a;
				}
			}
			if(s.length()>=t.length()) {
				return a;
			}
			else return b;
		}
		public static String removeleadingzeros(String s) {
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i) !='0') return s.substring(i);
			}
			return s;
		}
}
