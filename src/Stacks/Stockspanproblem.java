package Stacks;

import java.util.Arrays;

public class Stockspanproblem {
	public static void main(String[] args) {
		int [] arr = {10,2,4,90,120,80};
		int [] ans = new int[arr.length];
		Arrays.fill(ans, 1);
		calculatespan(arr,ans);
		for(int i:ans)
			System.out.print(i + " ");
	}
	public static void calculatespan(int []arr,int [] ans) {
		ans[0] = 1;
		for(int i = 1;i<arr.length;i++) {
			int count = 1;
			for(int j = i-1;j>=0;j--) {
				if(arr[i]>=arr[j]) count++;
				else {
					break;
				}
				ans[i] = count;
			}
			
		}
	}
}
