package Trees;

import java.util.List;

public class validateBST {
	public void inorderTraversal(TreeNode root,List<Integer> list) {
		if(root == null) return
		inorderTraversal(root.left,list);
		list.add(root.val);
		inorderTraversal(root.right,list);
	}
	public boolean validateBST(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		inorderTraversal(root,list);
		for(int i =1;i<list.size();i++) {
			if(arr.get(i-1) >arr.get(i)) return false;
		}
		return true;
	}
	
	// method - 2
	 static	boolean flag = true;
		public Long max(TreeNode root) {
			if(root == null) return Long.MIN_VALUE;
			Long leftMax = max(root.left);
			if(leftMax>=root.val) flag = false;
			Long rightMax = max(root.right);
	        return Math.max(root.val,Math.max(leftMax,rightMax));
		}
		public Long min(TreeNode root) {
			if(root == null) return Long.MAX_VALUE;
			Long leftMax = min(root.left);
			Long rightMax = min(root.right);
			if(rightMax<=root.val) flag = false;
	        return Math.min(root.val,Math.min(leftMax,rightMax));
		}
		public boolean isValidBST(TreeNode root) {
			flag = true;
			max(root);
			min(root);
			return flag;
		}
}
