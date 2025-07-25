package Sortingtechniques;

public class selectionsortusingmaximumnumber {
	//sort the given array in increasing order using selection sort but in each pass put the kth maximum element at the right position
	public static void main(String[] args) {
		int []arr = {5,8,-1,2,3,7};
		int n = arr.length;
		for(int i= 0;i<n - 1;i++) {
			int max = Integer.MIN_VALUE;
			int minpos = -1;
			for(int j = 0;j<n-i;j++) {
				if(max<arr[j]) {
					max = arr[j];
					minpos = j;
				}
			}
			int temp = arr[n-1-i];
			arr[n -1-i]= arr[minpos];
			arr[minpos]  = temp;
		}
		for(int  ele :arr) {
			System.out.print( ele + " ");
		}
	}
}	
