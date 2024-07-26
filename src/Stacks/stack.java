package Stacks;
import java.util.*;

public class stack {
	int top;
	int [] arr;
	stack(int n){
		arr = new int[n];
		top = -1;
	}
	public void push(int x) throws Exception{
		if(top == arr.length-1) throw new Exception("Stack Overflow");
		arr[++top] = x;
	}
	public int pop() throws Exception{
		if(top>-1)
		return arr[top--];
		else {
			throw new Exception("Stack Underflow");
		}
	}
	public int peek() throws Exception{
		if(top>-1)
			return arr[top];
			else {
				throw new Exception("Stack Underflow");
			}
	}
	public boolean isEmpty() {
		if(top == -1) return true;
		else return false;
	}
	public boolean isFull() {
		if(top == arr.length - 1) return true;
		else return false;
	}
	public void reverse(Stack<Integer> st) {
		if(st.size()>-1) {	
			System.out.println(st.pop());
			reverse(st);
		}
	}
}
