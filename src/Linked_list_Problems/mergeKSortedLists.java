package Linked_list_Problems;
/*Leetcode: https://leetcode.com/problems/merge-k-sorted-lists/ */
/*Problem is solved using an brute force approach: Once we learn the priority Queue, will reattempt and solve using the optimised approach*/
import java.util.ArrayList;
public class mergeKSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode l1 = list1;
        ListNode l2  = list2;
        ListNode t = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                t.next = l1;
                l1 = l1.next;
            }
            else{
                t.next = l2;
                l2 = l2.next;
            }
             t= t.next;
        }
        if(l1!=null)
            t.next = l1;
        else 
            t.next = l2;
            
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ArrayList<ListNode> list = new ArrayList<>();
        for(ListNode li:lists)
            list.add(li);
            int n = list.size();
        while(list.size() != 1){
            ListNode a = list.get(list.size()-1);
            list.remove(list.size()-1);
            ListNode b = list.get(list.size()-1);
            list.remove(list.size()-1);

            ListNode temp = mergeTwoLists(a,b);
            list.add(temp);

        }
        return list.remove(0);
    }
    public static void main(String[] args) {
		Node []list = {[1,4,5],[1,3,4],[2,6]};
		mergeKLists(list);
	}
}
