package Arrays;

public class mergetwosortedarrays {
	public static void main(String[] args) {
		int [] arr = {1,3,5,7};
		int []brr = {8,9,15,20,25};
		int []c = new int[arr.length + brr.length];
		for(int i = 0;i<c.length;i++) {
			if(i < arr.length && i<brr.length) {
				if(arr[i]<=brr[i]) c[i] = arr[i];
				else c[i] = brr[i];
			}
			else if(i >=arr.length && i<brr.length ) {
				c[i] = brr[i];
			}
			else if(i >=brr.length && i<arr.length) {
				c[i] = arr[i];
			}
		}
		for(int ele:c) {
			System.out.print(ele + " ");
		}
	}
}
