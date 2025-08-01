package Arrays;

public class print_array_in_wave_from {
	public static void swap(int []arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int []arr ={10, 5, 6, 3, 2, 20, 100, 80};
		int n = arr.length;
		for(int i = 0;i<n;i+=2) {
			if(i%2==0) {
				if(arr[i]>arr[i+1])
			}
		}
	}
}
