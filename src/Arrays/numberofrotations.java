package Arrays;

public class numberofrotations {
	public static void main(String[] args) {
		int []arr = {2,3,4,5,1};
		int n = arr.length;
		int lo = 0;
		int hi = n - 1;
		int mid = 0;
		while(lo<=hi) {
			 mid = lo + (hi - lo)/2;
			 if(arr[lo]<arr[hi]) {
				 System.out.println(lo + " ");
				 break;
			 }
			 if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]) {System.out.print(mid+" ");
			 break;
			 }
			if(arr[mid]>arr[hi]) lo = mid + 1;
			else hi = mid - 1;
		}
		System.out.println(mid + " ");
	}
}
