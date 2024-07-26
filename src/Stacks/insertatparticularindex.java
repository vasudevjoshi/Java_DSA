package Stacks;

import java.util.Stack;

public class insertatparticularindex {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10); st.push(20);
		st.push(50); st.push(80);
		System.out.println(st);
		// insert at bottom
		Stack<Integer> temp = new Stack<>();
		int pos = 2;
		while(st.size()>pos) {
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
