package Hashing;

public class happynumber {
	public static int sumOfSquare(int n){
		int sum = 0;
		while(n!=0){
			int rem = n %10;
			sum +=Math.pow(rem,2);
			n = n /10;
			}
		return sum;
		}
	public static void main(String[] args) {
		int n = 2;
		System.out.println(sumOfSquare(n));
	}
}
