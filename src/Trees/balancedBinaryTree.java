package Trees;

class Solution {
    public int height(TreeNode root){
        if(root == null ) return 0;
        return  1 + Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root  == null ) return true;
        if(root.left  == null && root.right == null )  return true;
        int left = height(root.left);
        int right = height(root.right);
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        if(Math.abs(left - right) <= 1 && isLeftBalanced && isRightBalanced) return true;
        return false;
    }
}
