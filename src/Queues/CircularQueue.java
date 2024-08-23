package Queues;

public class CircularQueue {
		int [] arr; 
		int size;
		int rear,front;
		CircularQueue(int n){
			arr = new int[n];
			size = n;
			rear = front = -1;
		}
		public boolean isEmpty() {
			return rear == -1 && front == -1;
		}
		public boolean isFull() {
			return (rear+1)%size ==front;
		}
		public void add(int data)throws Exception {
			if(isFull())
					throw new Exception("Queue is Full");
			else { 
				rear = (rear +1)%size;
				if(front == -1) front = 0;
				arr[rear] = data;
			}
		}
		public int remove() throws Exception{
			if(isEmpty())
					throw new Exception("Queue is Empty");
				int result = arr[front];
				if( rear == front) rear = front = -1;
				else {
					front = (front +1)%size;
				}
			return result;
		}
		public int peek() throws Exception{
			if(isEmpty())
				throw new Exception("Queue is Empty");
			return arr[front];
		}
	}

