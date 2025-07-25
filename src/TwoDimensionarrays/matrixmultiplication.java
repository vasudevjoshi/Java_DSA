package TwoDimensionarrays;

import java.util.Scanner;

public class matrixmultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][]a = new int[2][3];
		int [][] b = new int[3][4];
		System.out.println("Enter the elements of the matrix A");
		for(int i =0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the matrix B");
		for(int i =0;i<b.length;i++) {
			for(int j = 0;j<b[0].length;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i = 0;i<b.length;i++) {
			for(int j = 0;j<b[0].length;j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		// condition to check if no of columns of the first martix is equal to the no of rows of the second matrix
		if(a[0].length == b.length) {
		int [][] c = new int[a.length][b[0].length];
		for(int i = 0;i<c.length;i++) {
			for(int j = 0;j<c[0].length;j++) {
				for(int k = 0;k<b.length;k++) {// this inner loop is added because to check till what value of the elements of the matrix are taken.
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for(int i = 0;i<c.length;i++) {
			for(int j = 0;j<c[0].length;j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		}
		else {
			System.out.println("Matrix multiplication not possible!!");
		}
		
		
		sc.close();
	}
}
