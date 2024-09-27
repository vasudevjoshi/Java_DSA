package Queues;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
public class reverseFirstKElementsInAQueue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the queue: ");
		int n = sc.nextInt();
		for(int i= 0;i<n;i++)
				q.add(sc.nextInt());
		System.out.println("Enter the no of elements to be reversed: ");
		int k = sc.nextInt();
		for(int i = 0;i<k;i++)
			st.push(q.remove());
		while(!st.isEmpty())
				q.add(st.pop());
		for(int i = 0;i<k;i++)
			q.add(q.remove());
		System.out.println("Printing the Queue Elements: ");
		while(!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.remove();
		}
		
	}
}
