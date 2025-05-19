package Trees;

class Solution {
    public void path(TreeNode root, List<String> ans, String s) {
    if (root == null) return;
    if (root.left == null && root.right == null) {
        s += root.val;
        ans.add(s);
        return;
    }
    path(root.left, ans, s + root.val + "->");
    path(root.right, ans, s + root.val + "->");
}

public List<String> binaryTreePaths(TreeNode root) {
    List<String> ans = new ArrayList<>();
    path(root, ans, "");
    return ans;
}

}
