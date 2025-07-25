package Sortingtechniques;

public class SelectionSort {
		
		public static void selectionsorting(int arr[]) {
			for(int i = 0;i<arr.length-1;i++) {
				int min = Integer.MAX_VALUE;
				int minpos = 0;
				for(int j = i;j<arr.length;j++) {
					if(min>arr[j]){
						min = arr[j];
						minpos = j;
					}
					
				}
				int temp = arr[minpos];
				arr[minpos] = arr[i];
				arr[i] = temp;
			}
		}
		public static void main(String[] args) {
			int []arr = {5,4,1,3,2};
			selectionsorting(arr);
			for(int ele:arr) {
				System.out.print(ele + " ");
			}
			
		}
}
