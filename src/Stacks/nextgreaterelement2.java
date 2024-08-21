package Stacks;
import java.util.*;
public class nextgreaterelement2 {
	public static int[]ngr(int []arr){
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[arr.length];
        int n = arr.length;
        for(int i = n -1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = arr[st.peek()];
            st.push(i);
        }
        return ans;
    }
    public static int[] ngl(int []arr){
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[arr.length];
        int n = arr.length;
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = arr[st.peek()];
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
    	int [] arr = {1,2,3,4,3};
		int [] left = ngl(arr);
		int [] right  = ngr(arr);
		for(int i:left) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i:right) {
			System.out.print(i + " ");
		}
 	}
}
