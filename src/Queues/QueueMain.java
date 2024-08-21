package Queues;

import java.util.Scanner;

public class QueueMain {
	public static void main(String[] args) throws Exception {
		int n;
		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		queue q = new queue(n);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(50);
		System.out.println(q.peek());
		System.out.println("Removing the first element:"+ q.dequeue());
		System.out.println("Printing the Queue Elements");
		while(!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.dequeue();
		}
	}
}
