package Sortingtechniques;

public class bubblesortoptimised {
	public static boolean isSorted(int []arr) {
		boolean flag = true;
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag = false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int [] arr = {3,1,2,5,4};
		int n = arr.length;
		int count = 0;
		for(int x = 0;x<n-1;x++) {
			for(int i = 0;i<n-1-x;i++) {
				if(arr[i]>arr[i+1]) {
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
				}
			}
			if(isSorted(arr)) break;
		
		}
		for(int ele :arr) {
			System.out.print(ele + " ");
		}System.out.println();
		System.out.println(count);
	}
}
