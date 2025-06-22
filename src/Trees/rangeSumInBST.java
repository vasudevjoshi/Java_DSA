package Trees;

public class rangeSumInBST {
	private int ans;

    public int rangeSumBST(TreeNode root, int low, int high) {
        ans = 0;
        rangeSumHelper(root, low, high);
        return ans;
    }

    private void rangeSumHelper(TreeNode root, int low, int high) {
        if (root == null)
            return;
        if (low <= root.val && root.val <= high) {
            ans += root.val;
        }
        if (low < root.val) {
            rangeSumHelper(root.left, low, high);
        }
        if (root.val < high) {
            rangeSumHelper(root.right, low, high);
        }
    }
}
