package Trees;

public class constructBTfromPostOrderAndInOrder {
	 public TreeNode helper(int[] postorder, int[] inorder, int postlo, int posthi, int inlo, int inhi) {
	        if (postlo > posthi || inlo > inhi) return null;

	        TreeNode root = new TreeNode(postorder[posthi]);

	        // Find root in inorder array
	        int r = inlo;
	        while (inorder[r] != postorder[posthi]) r++;

	        int leftSize = r - inlo;

	        // Build left and right subtrees
	        root.left = helper(postorder, inorder, postlo, postlo + leftSize - 1, inlo, r - 1);
	        root.right = helper(postorder, inorder, postlo + leftSize, posthi - 1, r + 1, inhi);

	        return root;
	    }

	    public TreeNode buildTree(int[] inorder, int[] postorder) {
	        int n = postorder.length;
	        return helper(postorder, inorder, 0, n - 1, 0, n - 1);
	    }
}
