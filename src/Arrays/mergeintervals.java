package Arrays;

import java.util.*;

public class mergeintervals {
	 public static int[][] merge(int[][] arr) {
	        int n = arr.length;
			int m = arr[0].length;
			boolean flag = false;
			for(int i = 0;i<n;i++) {
				flag = false;
				for(int j = 0;j<n-i-1;j++) {
					if(arr[j][0]>arr[j+1][0]) {
						flag = true;
						int temp = arr[j][0];
						arr[j][0] = arr[j+1][0];
						arr[j+1][0] = temp;
						temp = arr[j][1];
						arr[j][1] = arr[j+1][1];
						arr[j+1][1] = temp;
						}
				}
				if(flag == false)
						break;
			}
	       ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	        for(int i =0;i<n;i++){
	            ArrayList<Integer> x = new ArrayList<>();
	            if(arr[i][1] >= arr[i+1][0]){
	                x.add(arr[i][0]);
	                x.add(arr[i+1][1]);
	            }
	            else {
	            	x.add(arr[i][0]);
	                x.add(arr[i][1]);
	            }
	            list.add(x);
	        }
	        n = list.size();
	        System.out.println(n);
	        int [][] ans = new int[n][2];
	        for(int i = 0;i<n;i++){
	            ArrayList<Integer> x =list.get(i);
	            System.out.print(x);
//	            ans[i][0] = x.get(0);
//	            ans[i][1] = x.get(1);
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		int [][]arr = {{15,18},{1,3},{8,10},{2,6}};
		int n = arr.length;
		int m = arr[0].length;
		boolean flag = false;
		for(int i = 0;i<n;i++) {
			flag = false;
			for(int j = 0;j<n-i-1;j++) {
				if(arr[j][0]>arr[j+1][0]) {
					flag = true;
					int temp = arr[j][0];
					arr[j][0] = arr[j+1][0];
					arr[j+1][0] = temp;
					temp = arr[j][1];
					arr[j][1] = arr[j+1][1];
					arr[j+1][1] = temp;
					}
			}
			if(flag == false)
					break;
		}
		for(int [] i: arr) {
			for(int j :i)
					System.out.print(j + " ");
		}
		System.out.println();
		merge(arr);
	}
}
