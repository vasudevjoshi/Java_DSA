package Sortingtechniques;

public class Decreasingbubblesort {
	public static void main(String[] args) {// sorting the array in the decresing order
		int []arr = {5,8,-1,2,3,7};
		int n = arr.length;
		for(int i = 0;i<n - 1;i++) {
			boolean flag  = true;
			for(int j = 0;j<n - 1 -i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
			}
			if(flag == true) break;
		}
		for(int  ele :arr) {
			System.out.print( ele + " ");
		}
	}
}
