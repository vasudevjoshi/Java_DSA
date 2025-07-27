package Trees;

/**********************************************************
Following is the Binary Tree Node class.

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
	this.data = data;
    }
}

***********************************************************/

public class Solution {
 public static boolean isExist(BinaryTreeNode<Integer> root,int node){
    if(root == null ) return false;
    if(root.data == node) return true;
    return isExist(root.left,node) || isExist(root.right,node);
}
public static BinaryTreeNode<Integer> lowestCommonAncestor(BinaryTreeNode<Integer> root, int p, int q) {
    if(p == root.data || q == root.data )return root;
    boolean pLiesInLST =  isExist(root.left,p);
    boolean qLiesInLST = isExist(root.left,q);
    if(pLiesInLST == true && qLiesInLST == true ) return lowestCommonAncestor(root.left,p,q);
    if(pLiesInLST == false && qLiesInLST == false) return lowestCommonAncestor(root.right,p,q);
    return root;
}
public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
        int node3) {
    // Write your code here.
	BinaryTreeNode<Integer> parent1 =lowestCommonAncestor(root,node1,node2);
	BinaryTreeNode<Integer> common = lowestCommonAncestor(root,parent1.data,node3);
	return common;
}
}
