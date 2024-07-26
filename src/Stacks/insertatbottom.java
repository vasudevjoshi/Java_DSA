package Stacks;

import java.util.Stack;

public class insertatbottom {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10); st.push(20);
		st.push(50); st.push(80);
		System.out.println(st);
		// insert at bottom
		Stack<Integer> temp = new Stack<>();
		while(!st.isEmpty()) {
			temp.push(st.pop());
		}
		System.out.println(temp);
		st.push(25);
		while(!temp.isEmpty()) {
		st.push(temp.pop());
		}
		System.out.println(st);
	}
}
