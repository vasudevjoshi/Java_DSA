package Stacks;

public class stackll {
	Node head = null;
	int size;
	void push(int x) {
		if(isEmpty()) {
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
		}
		else {
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
		}
		size++;
	}
	int pop() {
		if(isEmpty()) return 0;
		else {
			int temp = head.val;
			System.out.print(temp + " ");
			head = head.next;
			return temp;
		}
	}
	int peek() {
		if(isEmpty()) return 0;
		else {
			int temp = head.val;
			return temp;
		}
	}
	int size() {
		if(isEmpty()) return 0;
		else return size;
	}
	boolean isEmpty() {
		if(head == null)
			return true;
		else return false;
	}
	void display(Node head) {
		if(head == null) 
		 return;
		else {
			display(head.next);
			System.out.print(head.val+ " ");
		}
	}
}
