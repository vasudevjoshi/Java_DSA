package Queues;
import java.util.*;
public class QueueJCF {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0;i<5;i++)
			q.add(i + 1);
	System.out.println("Printing the Queue elements: ");
	while(!q.isEmpty()) {
		System.out.print(q.peek());
		q.remove();
		
	}
	}
}
