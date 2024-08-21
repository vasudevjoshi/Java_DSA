package Queues;
import java.util.*;

public class queue {
		int [] arr;
		 int size;
		 int rear;
		
		queue(int n){
			arr = new int[n];
			size = n;
			rear= -1;
		}
		public boolean isEmpty() {
			return rear ==-1;
		}
		// add
		public void enque(int data) throws Exception{
			if(rear == size -1)
				throw new Exception("Queue Full");
			else {
				rear = rear +1;
				arr[rear] = data;
			}
		}
		// removing the elements from the queue
		public int dequeue() throws Exception{
			int front;
			if(isEmpty())
					throw new Exception("Queue Empty");
			else {
				front =arr[0];
				for(int i = 0;i<rear;i++)
						arr[i] =arr[i+1];
				rear--;
			}
			return front;
		}
		public int peek() throws Exception{
		if(isEmpty())
			throw new Exception("Queue Empty");
			return arr[0];
		}

}
