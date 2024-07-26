package Stacks;

import java.util.Stack;

public class stack_library {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.reversed());
		System.out.println(st.size());
		System.out.println(st);
	}
}
