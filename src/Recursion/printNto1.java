package Recursion;
import java.util.*;
public class printNto1 {
//	public static void print(int n) {
//		if(n==0) return;
//		else {
//			print(n-1);
//			System.out.println(n);
//			
//		}
//	}
	public static void printIncreasing(int x,int n) {
		if(x>n) return;
		System.out.println(x);
		printIncreasing(x+1,n);
	}
	public static void main(String[] args) {
		System.out.println("enter the n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncreasing(1,n);
		
		
	}
}
