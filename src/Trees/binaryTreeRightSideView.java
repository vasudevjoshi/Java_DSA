package Trees;

public class binaryTreeRightSideView {
	 private int levels(TreeNode root){
	        if(root == null )return 0;
	        return 1 + Math.max(levels(root.left),levels(root.right));
	    }
	    // private void printTheNthLevel(TreeNode root,List<Integer> list,int lvl,int level){
	    //     if(root == null ) return;
	    //     if(level == lvl){
	    //         list.add(root.val);
	    //         return;
	    //     }
	    //     printTheNthLevel(root.left,list,lvl + 1,level);
	    //     printTheNthLevel(root.right,list,lvl + 1,level);
	    // }

	    private void dfs(TreeNode root,int level,List<Integer> ans){
	        if(root == null) return ;
	         ans.set(level,root.val);
	         dfs(root.left,level + 1, ans);
	         dfs(root.right,level + 1,ans);
	    }
	    public List<Integer> rightSideView(TreeNode root) {
	        // List<List<Integer>> temp = new ArrayList<>();
	        // int ll = levels(root);
	        // for(int i = 0;i<ll;i++){
	        //     List<Integer> x = new ArrayList<>();
	        //     printTheNthLevel(root,x,0,i);
	        //     temp.add(x);
	        // }
	        // List<Integer> ans = new ArrayList<>();
	        // int n = temp.size();
	        // for(int i = 0;i<n;i++){
	        //     List<Integer> t = temp.get(i);
	        //     ans.add(t.get(t.size() - 1));
	        // }
	        List<Integer> ans = new ArrayList<>();
	        int levels = levels(root);
	        for(int i = 0;i<levels;i++){
	            ans.add(0);
	        }
	        dfs(root,0,ans);
	        return ans;
	    }
}	
