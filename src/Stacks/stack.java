package Stacks;
import java.util.*;

public class stack {
	int top;
	int [] arr;
	stack(int n){
		arr = new int[n];
		top = 0;
	}
	public void push(int x) throws Exception{
		if(isFull()) throw new Exception("Stack Overflow");
		arr[top++] = x;
	}
	public int pop() throws Exception{
		if(!isEmpty())
		return arr[--top];
		else {
			throw new Exception("Stack Underflow");
		}
	}
	public int peek() throws Exception{
		if(!isEmpty())
			return arr[top-1];
			else {
				throw new Exception("Stack Underflow");
			}
	}
	public boolean isEmpty() {
		if(top == 0) return true;
		else return false;
	}
	public boolean isFull() {
		if(top == arr.length) return true;
		else return false;
	}
	public void display() {
		if(isEmpty()) return;
		else {
		System.out.print("[");
		for(int i: arr)	System.out.print(i + " ");
		System.out.print("]");
		}
	}
	public int size() {
		if(isEmpty()) return 0;
		else return top;
		
	}
	public void reverse (stack st) throws Exception {
		if(isEmpty()) {	
			return;
		}
		int element = pop();
		System.out.println(element);
		reverse(st);
		push(element);
	}
}
