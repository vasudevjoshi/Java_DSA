package Recursion;
import java.util.*;
public class powerofaraisedtob {
	public static int power(int b,int p) {
		if(p<=0) return 1;
		else return b * power(b,p-1);
	}
	public static void main(String[] args) {
		System.out.println("Enter the values of m and n: ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("the power is " + power(m,n));
	}
}
