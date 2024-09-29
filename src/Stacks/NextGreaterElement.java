package Stacks;
import java.util.Stack;
/*Geeks for Geeks: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/0 */
public class NextGreaterElement 
	{
	    //Function to find the next greater element for each element of the array.
	    public static int[] nextLargerElement(int[] arr, int n)
	    { 
	        // Your code here
	        int [] output = new int[n];
	        Stack<Integer> st = new Stack<>();
	        output[n-1] = -1;
	        st.push(arr[n-1]);
	        for(int i = n-2;i>=0;i--){
	            while(!st.isEmpty() && arr[st.peek()]>=arr[i] ) st.pop();
	            if(st.isEmpty()) output[i] = -1;
	            else output[i] = arr[st.peek()];
	            st.push(i);
	        }
	        return output;
	    } 
	    public static void main(String[] args) {
	    	int  []arr = {8,4,6,2,3};
	    	int[]result = nextLargerElement(arr,arr.length);
	    	for(int i:result)
	    			System.out.print(i + " ");
		}
}
