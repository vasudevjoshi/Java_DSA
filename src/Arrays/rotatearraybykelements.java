package Arrays;

public class rotatearraybykelements {
	public static void reverse(int []arr,int n,int m) {
		int front = n;
		int rear = m;
		while(front<rear) {
			int temp = arr[front];
			arr[front] = arr[rear];
			arr[rear]= temp;
			front++;
			rear--;
		}
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7};
		//reversal(arr,arr.length);
		int k = 2;
		reverse(arr,0,arr.length-k-1);
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		reverse(arr,arr.length-k,(arr.length-1));
		for(int i:arr) {
			System.out.print(i + " ");
		}System.out.println();

		reverse(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i + " ");
		}System.out.println();
	}
}
