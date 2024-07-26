package Doubly_Linkedlist;
// import Doubly_Linkedlist.Node;
public class DLL extends Node{
	Node head = null; 
	Node tail = null;
	int size;
	public void insertattail(int a) {
		Node temp = new Node(a);	
		if(head == null) {
			head = temp;
			tail = temp;
			size++;
		}
		else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
			size++;       
		}
	}
	public void insertathead(int a) {
		Node temp = new Node(a);
		if(head == null) {
			head = tail = temp;
			size++;
		}
		else {
			head.prev = temp;
			temp.next = head;
			head = head.prev;
			size++;
		}
	}
	public void insertatindex(int idx,int val) {
		if(idx == 0) {
			insertathead(val);
			return;
		}
		else if(idx == size) {
			insertattail(val);
			return;
		}
		else if(idx > size || idx < 0) {
			System.out.println("invalid index\n");
			return;
		}
		else {
			Node temp = new Node(val);
			Node x = head;
			for(int i = 1;i<=idx - 1;i++) {
				x = x.next;
			}
			Node y = x.next;
			x.next = temp; temp.prev = x;
			y.prev = temp; temp.next = y;
			size++;
		}
	}
	public void deleteathead() {
		if(size == 0) {
			System.out.println("list is empty\n");
			return;
			}
		else {
			head = head.next;
			head.prev = null;
			size--;
		}
	}
	public void deleteattail() {
		if(size == 0) {
			System.out.println("list is empty\n");
			return;
		}
		else {
			tail = tail.prev;
			tail.next = tail.next.next;
			size--;
		}
	}
	public void deleteatindex(int idx) {
		if(idx == 0) {
			deleteathead();
			return;
		}
		else if(idx == size-1) {
			deleteattail();
			return;
		}
		else if(idx > size || idx < 0) {
			System.out.println("Invalid Index\n");
			return;
		}
		else {
			Node temp = head;
			for(int i = 1;i<=idx - 1;i++) {
				temp= temp.next;
			}
			temp.next =temp.next.next;
			temp = temp.next;
			temp.prev = temp.prev.prev;
			size--;
		}
		
	}
	public void get(int idx,Node head) {
		if(idx > size || idx < 0) {
			System.out.println("Invalid Index\n");
			return;
		}
		else {
			Node temp = head;
			for(int i = 0;i<idx;i++) {
				temp = temp.next;
			}
			System.out.println(temp.val + " ");
		}
		
	}
	public void set(int idx,int val,Node head) {
		if(idx > size || idx < 0) {
			System.out.println("Invalid Index\n");
			return;
		}
		else {
			Node temp = head;
			for(int i = 0;i<idx;i++) {
				temp = temp.next;
			}
			temp.val = val;
		}
		
	}
	public void printsize() {
		System.out.print(size + " ");
	}
	public void print(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void printInReverse(Node tail) {
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.val + " ");
			temp = temp.prev;
		}
		System.out.println();
		
	}
	public void displayFromstart(Node random) {
		Node temp = random;
		while(temp.prev!=null) {
			temp = temp.prev;
		}
		while(temp!=null){
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
//	public   void main(String[] args) {
//		Node a = new Node(10);
//		Node b = new Node(20);
//		Node c = new Node(30);
//		Node d = new Node(40);
//		a.next = b; a.prev = null;
//		b.next = c; b.prev = a;
//		c.next = d; c.prev = b;
//		d.next = null; d.prev = c;
//		print(a);
//		printInReverse(d);
//		displayFromstart(c);
//	}
}
