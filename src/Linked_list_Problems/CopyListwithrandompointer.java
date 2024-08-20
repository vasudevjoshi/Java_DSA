package Linked_list_Standard_Questions;

public class CopyListwithrandompointer {
	/*
	 * class Node{
	 * 	int val
	 * 	Node next;
	 * 	Node random;
	 * 	Node(int val){
	 * 		this.val = val;
	 * 		this.next = null;
	 * 		this.random = null;
	 * 	}
	 * }*/
	 public Node deepcopy(Node head){
	        Node head2 = new Node(head.val);
	        Node temp1 = head.next;
	        Node temp2 = head2;
	        while(temp1!=null){
	            Node dum = new Node(temp1.val);
	            temp2.next = dum;
	            temp2 = temp2.next;
	            temp1 = temp1.next;
	        }
	        return head2;
	    }
	    public void connectalternatively(Node head, Node head2){
	        Node t1 =head;
	        Node t2 = head2;
	        Node dummy = new Node(-1);
	        Node t = dummy;
	        while(t1!=null && t2!=null){
	            t.next = t1;
	            t1 = t1.next;
	            t= t.next;
	            t.next = t2;
	            t2 =t2.next;
	            t =t.next;
	        }
	    }
	    public void assignrandompointer(Node head,Node head2){
	        Node t1 =head;
	        Node t2 = head2;
	        while(t1!=null){
	            t2 =t1.next;
	            if(t1.random!=null)
	                t2.random = t1.random.next;
	            t1 = t1.next.next;
	        }
	    }
	    public void splitlist(Node head,Node head2){
	         Node t1 =head;
	        Node t2 = head2;
	        while(t1!=null){
	            t1.next = t2.next;
	            t1 =t1.next;
	            if(t1 == null) break;
	            t2.next = t1.next;
	            t2 =t2.next;
	        }
	    }
	    public Node copyRandomList(Node head) {
	        if(head == null ) return head;
	        Node head2 = deepcopy(head);
	        // step 2 : join the listnode alternatively
	        connectalternatively(head,head2);
	        // step 3: assign the random pointer to deep copy
	        assignrandompointer(head,head2);
	        // step4 : split the linked list in the orginal list
	        splitlist(head,head2);
	        return head2;
	    }
}
