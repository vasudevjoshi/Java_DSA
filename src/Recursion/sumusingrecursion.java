package Recursion;

public class sumusingrecursion {
		public static int sum(int n) {
			if(n==0) return 1;
			else return n * sum(n-1);
		}
	public static void main(String[] args) {
		int n = 5;
		System.out.println("the sum is: " + sum(n));
	}
}
