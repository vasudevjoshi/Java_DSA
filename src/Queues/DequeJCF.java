package Queues;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class DequeJCF {
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		System.out.println("Enter the no of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++)
			deque.addFirst(i + 10);
		 	deque.addLast(20);
		 	deque.addLast(40);
		 	deque.addFirst(-50);
		 	System.out.println("Printing the Deque Elements: ");
		 	System.out.println(deque);
		 	System.out.println("First Element: "+ deque.getFirst());
		 	System.out.println("Last Element : " + deque.getLast());
		 	System.out.println("Removing the First Element : "+ deque.removeFirst());
		 	System.out.println("Printing the Deque Elements: ");
		 	System.out.println(deque);
		 	System.out.println("Removing the Last Element : "+ deque.removeLast());
		 	System.out.println("Printing the Deque Elements: ");
		 	System.out.println(deque);
		
	}
}
