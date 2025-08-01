package Arrays;

public class findthepivotindex {
	public static void main(String[] args) {
		int []arr = {1,7,3,6,5,6};
		int n = arr.length;
		int []sumr = new int[n];
		sumr[n-1] = arr[n -1];
		for(int i = n -2;i>=0;i--) {
			sumr[i] = (arr[i] + sumr[i+1]);
		}
		for(int ele:sumr) {
			System.out.print(ele + " ");
		}System.out.println();
		int totsum = 0;
		for(int ele:arr) {
			totsum +=ele;
		}
		int [] suml = new int[n];
		suml[0]=arr[0];
		for(int i = 1;i<n;i++) {
			suml[i] = (arr[i] + suml[i -1]);
		}
		for(int ele:suml) {
			System.out.print(ele + " ");
		}
		System.out.println();
		int k = 0;
		int rsum = 0;
		while(k<n-1) {
			rsum = (totsum - suml[k] - arr[k +1]);
			if(suml[k] == rsum) {
				System.out.println(k + " ");
			}
			k++;
		}
	}
}
