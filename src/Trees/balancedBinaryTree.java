package Trees;

class Solution {
    public int height(TreeNode root){
//        if(root == null ) return 0;
//        return  1 + Math.max(height(root.left),height(root.right));
    	
    	if(root == null) return 0;
    	int leftLevels = height(root.left,ans);
    	int rightLevels = height(root.right,ans);
    	int diff = Math.abs(rightLevels - leftLevels);
    	if(diff >1) ans[0] = false;
    	return 1 + Math.max(rightLevels, leftLevels);
    }
    public boolean isBalanced(TreeNode root) {
//        if(root  == null ) return true;
//        if(root.left  == null && root.right == null )  return true;
//        int left = height(root.left);
//        int right = height(root.right);
//        boolean isLeftBalanced = isBalanced(root.left);
//        boolean isRightBalanced = isBalanced(root.right);
//
//        if(Math.abs(left - right) <= 1 && isLeftBalanced && isRightBalanced) return true;
//        return false;
    		boolean ans[] = {true};
    		height(root,ans);
    		return ans;
    		
    }
}
