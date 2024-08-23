package Queues;

public class QueueLLmain {
	public static void main(String[] args) throws Exception {
		QueueLL q = new QueueLL();
		for(int i = 0;i<5;i++)
				q.add(i + 1);
		System.out.println("Printing the Queue elements: ");
		while(!q.isEmpty()) {
			System.out.print(q.peek());
			q.remove();
			
		}
	}
}
