import java.util.*;

public class Solution
{
    public static TreeNode<Integer> balancedBST(ArrayList<Integer> list,int i,int j){
        if(i>j) return null; 
        int mid = i + (j - i)/2;
        TreeNode<Integer> root = new TreeNode<>(list.get(mid));
        root.left = balancedBST(list,i,mid -1);
        root.right = balancedBST(list,mid + 1, j);
        return root;
    }
	public static TreeNode<Integer> sortedListToBST(Node<Integer> head)
	{
      ArrayList<Integer> list = new ArrayList<>();
      Node<Integer> temp = head;
      while(temp!=null){
          list.add(temp.data);
          temp = temp.next;
      }
      int len = list.size();
      return balancedBST(list,0,list.size() -1);
	}
}