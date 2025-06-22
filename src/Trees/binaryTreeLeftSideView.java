package Trees;

public class binaryTreeLeftSideView {
	  private int levels(Node root){
	        if(root == null )return 0;
	        return 1 + Math.max(levels(root.left),levels(root.right));
	    }
	    private void dfs(Node root,int level,List<Integer> ans){
	        if(root == null) return ;
	         ans.set(level,root.data);
	         dfs(root.right,level + 1,ans);
	         dfs(root.left,level + 1, ans);
	        
	    }
  ArrayList<Integer> leftView(Node root) {
      // code here
      ArrayList<Integer> ans = new ArrayList<>();
	        int levels = levels(root);
	        for(int i = 0;i<levels;i++){
	            ans.add(0);
	        }
	        dfs(root,0,ans);
	        return ans;
      
  }
}
