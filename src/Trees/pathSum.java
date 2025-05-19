package Trees;

class Solution {
    public void isEqual(TreeNode root,List<Integer> list,int sum){
        if(root == null) return;
        if(root.left == null && root.right == null ) {
            sum+=root.val;
            list.add(sum);
            return;
        }
        isEqual(root.left,list,sum + root.val);
        isEqual(root.right,list,sum + root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        isEqual(root,list,sum);
        for(int i= 0;i<list.size();i++){
            if(list.get(i) == targetSum) return true;
        }
        return false;
    }
}
