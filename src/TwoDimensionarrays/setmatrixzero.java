package TwoDimensionarrays;

import java.util.Scanner;

public class setmatrixzero {
		public static void setzero(int [][]arr,int m,int n) {
			for(int i = 0;i<arr.length;i++)
				arr[i][n] = 0;
			for(int j = 0;j<arr[0].length;j++)
				arr[m][j]= 0;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int [][]arr = new int[3][4];
			int m =arr.length;
			int n = arr[0].length;
			for(int i = 0;i<m;i++)
				for(int j = 0;j<n;j++)
					arr[i][j] = sc.nextInt();
			boolean []row = new boolean[m];
			boolean []col = new boolean[n];
			for(int i = 0;i<m;i++)
				for(int j = 0;j<n;j++)
					if(arr[i][j]==0) {
						row[i] = true;
						col[j] = true;
					}
			for(int i = 0;i<m;i++)
				if(row[i]==true) {
					for(int j = 0;j<n;j++)
						arr[i][j]= 0;
				}
			for(int j = 0;j<n;j++) {
				if(col[j]== true) {
					for(int i = 0;i<m;i++) {
						arr[i][j] =0;
					}
				}
			}
			
			for(int []rows:arr) {
				for(int ele : rows)
					System.out.print(ele + " ");
				System.out.println();
			}
		}
}
