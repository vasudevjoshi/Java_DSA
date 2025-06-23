package Trees;

public class balanceBST {
	class Solution {
	    public void helper(TreeNode root, List<Integer> list){
	        if(root == null) return;
	        helper(root.left, list);
	        list.add(root.val);
	        helper(root.right, list);
	    }

	    public TreeNode buildBalancedBST(List<Integer> list, int start, int end){
	        if(start > end) return null;

	        int mid = (start + end) / 2;
	        TreeNode root = new TreeNode(list.get(mid));
	        root.left = buildBalancedBST(list, start, mid - 1);
	        root.right = buildBalancedBST(list, mid + 1, end);
	        return root;
	    }

	    public TreeNode balanceBST(TreeNode root) {
	        List<Integer> list = new ArrayList<>();
	        helper(root, list);
	        return buildBalancedBST(list, 0, list.size() - 1);
	    }

	}
}
