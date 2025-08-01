package Arrays;
import java.util.*;
public class SpiralMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][]arr = new int[n][m];
		int val = 1;
		int minc = 0;
		int minr = 0;
		int maxr = n-1;
		int maxc= m - 1;
		while(minc<=maxc && minr<=maxr) {
		for(int i = minc;i<=maxc;i++) {
			arr[minr][i] = val++;
		}
		minr++;
		for(int i = minr;i<=maxr;i++) {
			arr[i][maxc] = val++;
		}
		maxc--;
		for(int i = maxc;i>=minc;i--) {
			arr[maxr][i] = val++;
		}
		maxr--;
		for(int i =maxr;i>=minr;i-- ) {
			arr[i][minc]=val++;
		}
		minc++;
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
