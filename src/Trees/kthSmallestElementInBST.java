package Trees;

public class kthSmallestElementInBST {
	public void helper(TreeNode root,List<Integer> ans){
        if(root == null) return;
        helper(root.left,ans);
         ans.add(root.val);
        helper(root.right,ans);
    }
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans.get(k-1);
    }
}
