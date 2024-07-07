package Linked_list_Standard_Questions;
/*Leetcode 24: https://leetcode.com/problems/swap-nodes-in-pairs/*/
public class swap_nodes_in_pairs {
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null ) return head;
        ListNode cur = head;
        ListNode Next = null;
        ListNode prev = null;
        ListNode newhead = null;
        while(cur!=null && cur.next!=null){
            if(prev == null){
                newhead = cur.next;
                Next = cur.next;
                cur.next = cur.next.next;
                Next.next = cur;
                prev = cur;
                cur = cur.next;
            }
            else{
                Next = cur.next;
                cur.next = cur.next.next;
                Next.next = cur;
                prev.next = Next;
                prev = cur;
                cur = cur.next;
            }
        }
        return newhead;
    }
}
