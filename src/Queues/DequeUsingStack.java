package Queues;

import java.util.Deque;
import java.util.LinkedList;
class stack{
	Deque<Integer> deque = new LinkedList<>();
	
	void push(int data) {
		deque.addLast(data);
	}
	int pop() {
		return deque.removeLast();
	}
	int peek() {
		return deque.getLast();
	}
}
public class DequeUsingStack {
	public static void main(String[] args) {
		stack st = new stack();
		st.push(10); st.push(20); st.push(50); st.push(60);
		st.push(80);
		System.out.println("Removing the stack top: " + st.pop());
		System.out.println("Printing the stack Top: "+ st.peek());
	}
}
