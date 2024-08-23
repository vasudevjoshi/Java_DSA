package Queues;
import java.util.*;
/*TIME COMPLEXITY: for adding of new elements TC is O(n)
 * and for removing is O(1) 
 * For adding we remove all the elements from stack 1 and push to the stack 2 and then add new element in the stack 1. Then again
 * pop all elements from the stack 2 to the stack one*/
class Queue{
	  Stack<Integer> st1 = new Stack<>();
	  Stack<Integer> st2 = new Stack<>();
	public boolean isEmpty() {
		return st1.isEmpty();
	}
	public  void add(int data) {
		while(!st1.isEmpty())
				st2.push(st1.pop());
		st1.push(data);
		while(!st2.isEmpty())
				st1.push(st2.pop());
	}
	public  int remove() {
		if(isEmpty())
				return -1;
		else
			return st1.pop();
	}
	public  int peek() {
		if(isEmpty()) 
				return -1;
		else
			return st1.peek();
	}
}
public class QueueUsingTwoStacks {
		public  static void main(String[] args) {
			Queue q = new Queue();
			for(int i = 0;i<5;i++)
					q.add(i + 1);
			System.out.println("Printing the Queue Elements: ");
			while(!q.isEmpty())
			{
				System.out.print(q.peek());
				q.remove();
			}
		}
}

