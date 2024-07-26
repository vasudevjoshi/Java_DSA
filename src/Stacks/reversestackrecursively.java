package Stacks;

import java.util.Stack;

public class reversestackrecursively {
	public static void reverse(Stack<Integer> st) {
		if(st.size()>0) {	
			System.out.println(st.pop());
			reverse(st);
			st.push(st.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10); st.push(20);
		st.push(50); st.push(80);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}
}
