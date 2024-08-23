package Queues;
	
public class CircularQueueMain {
	public static void main(String[] args) throws Exception {
		CircularQueue q = new CircularQueue(10);
		for(int i = 0;i<10;i++)
			q.add(10 -i+1);
		
		System.out.println("Printing first 5 queue elements\n");
		for(int i = 0;i<5;i++) {
			System.out.println(q.peek());
			q.remove();
		}
		System.out.print("Adding the 5 elements in the queue\n");
		for(int i = 0;i<5;i++) {
				q.add((int) Math.pow(i, 2));
		}
		System.out.println("Printing the peek element in the queue\n" + q.peek());
	}
}
