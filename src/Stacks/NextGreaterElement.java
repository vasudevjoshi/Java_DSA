package Stacks;
/*Geeks for Geeks: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/0 */
public class NextGreaterElement {
	{
	    //Function to find the next greater element for each element of the array.
	    public static long[] nextLargerElement(long[] arr, int n)
	    { 
	        // Your code here
	        long[] output = new long[n];
	        Stack<Long> st = new Stack<>();
	        output[n-1] = -1;
	        st.push(arr[n-1]);
	        for(int i = n-2;i>=0;i--){
	            while(!st.isEmpty() && st.peek()<=arr[i] ) st.pop();
	            if(st.isEmpty()) output[i] = -1;
	            else output[i] = st.peek();
	            st.push(arr[i]);
	        }
	        return output;
	    } 
}
