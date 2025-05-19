package Trees;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null || (root. left == null && root.right == null) ) return root;
        TreeNode temp= root.left;
        root.left = root.right;
        root.right =temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
        
    }
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p != null && q == null ) return false;
        if(p == null && q != null) return false;
        if(p.val != q.val) return false;
        if(isSameTree(p.left,q.left) == false) return false;
        if(isSameTree(p.right,q.right) == false) return false;
        return true;

    }
    public boolean isSymmetric(TreeNode root) {
        invertTree(root.right);
        if(isSameTree(root.left,root.right)) return true;
        return false;
    }
}