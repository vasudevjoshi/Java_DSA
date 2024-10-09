package Linked_list_Problems;
/*GFG: https://www.geeksforgeeks.org/problems/linked-list-matrix/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card*/
import java.util.*;
class Node{
	int data;
	Node right,down;
	Node(int data){
		this.data = data;
		right = null;
		down = null;
	}
}
public class linkedListMatrix {
	    static Node construct(int arr[][]) {
	        // Add your code here.
	        int r = arr.length;
	        int c = arr[0].length;
	        List<Node> list = new ArrayList<>();
	        Node head = null;
	        Node temp = null;
	        for(int i = 0;i<r;i++){
	            for(int j = 0;j<c;j++){
	                Node n = new Node(arr[i][j]);
	                if(head == null) {
	                    head = n;
	                    temp = n;
	                }
	                else{
	                    temp.right = n;
	                    temp = temp.right;
	                }
	            }
	            list.add(head);
	            head = null;
	        }
	        int n = list.size();
	        for(int i = 0;i<n-1;i++){
	            Node up =list.get(i);
	            Node below = list.get(i + 1);
	            while(up!=null){
	                up.down =below;
	                up = up.right;
	                below =below.right;
	            }
	        }
	        return list.get(0);
	    }
}
