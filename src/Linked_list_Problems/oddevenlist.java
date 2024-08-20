package Linked_list_Standard_Questions;

public class oddevenlist {
	public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }// brute force: Using the index of the node in the list
        // ListNode prev = null;
        // ListNode cur = head;
        // ListNode temp = head;
        // ListNode temp2 = head;
        // int n = 1;
        // int i = 1;
        // while(temp.next!=null){
        //     temp = temp.next;
        //     n++;
        // }
        // while(i<=n){
        //     if(i%2==0){
        //         temp.next = cur;
        //         prev.next = cur.next;
        //         temp =temp.next;
        //     }
        //     prev = cur;
        //     cur = cur.next;
        //     i++;
        // }
        // temp.next = null;
        // Optimal Solution: Using the Dummy node for the odd and even list and changing the links in the original list
        ListNode temp_odd = head;
        ListNode temp_even = head.next;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode temp1 = odd;
        ListNode temp2 = even;
        while(temp_odd.next!=null && temp_odd.next.next!=null ){
            temp1.next = temp_odd;
            temp_odd = temp_odd.next.next;
            temp1 = temp1.next;
            temp2.next = temp_even;
            temp_even = temp_even.next.next;
            temp2 = temp2.next;
        }
        temp1.next = temp_odd;
        temp1 = temp1.next;
        temp2.next = temp_even;
        temp2 = temp2.next;
        temp1.next = even.next;
        return head;
    }
}
