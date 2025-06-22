package Trees;

public class min_max_NodeInBST {
    public TreeNode minimum(TreeNode root) {
        if (root == null || root.left == null) return root;
        return minimum(root.left);
    }

    public TreeNode maximum(TreeNode root) {
        if (root == null || root.right == null) return root;
        return maximum(root.right);
    }
}
