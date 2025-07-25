package Recursion;

public class countgoodnumber {
	public static long count(long n) {
		if(n<=0) 
			return 5;
		else if(n%2 == 0)
			return 5 * count(n-1);
		else if(n%2==1)
			return 4 * count(n-1);
		return 0;
	}
	public static void main(String[] args) {
		int n = 4;
		System.out.println(count(49));
	}
}
