package Queues;

public class QueueLL {
	node head = null;
	node tail = null;
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	public void add(int data) {
		node newnode = new node(data);
			if(isEmpty())
					head = tail = newnode;
			else {
				tail.next = newnode;
				tail = tail.next;
			}
	}
	public int remove() throws Exception{
		if(isEmpty())
				throw new Exception("Queue is Empty");
			
		int result = head.data;
		if(tail == head) tail = head = null;
		else head = head.next;
		return result;
	}
	public int peek() throws Exception{
		if(isEmpty())
				throw new Exception("Queue is Empty\n");
		return head.data;
	}
}
