package Trees;

public class flattenBTIntoLinkedList {
	// public void reverse(TreeNode root){}
    // public void addToQueue(Queue<TreeNode> q,TreeNode root){
    //     if(root == null) return;
    //     q.offer(root);
    //     addToQueue(q,root.left);
    //     addToQueue(q,root.right);
    // }
    public void flatten(TreeNode root) {
        // if(root == null || (root.left == null && root.right == null))return;
        // Queue<TreeNode> q = new LinkedList<>();
        // addToQueue(q,root);
        // root = q.remove();
        // root.left = null;
        // TreeNode pointer = root;
        // while(!q.isEmpty()){
        //     TreeNode temp = q.remove();
        //     temp.left = null;
        //     pointer.right = temp;
        //     pointer = temp;
        // }

        if(root == null ) return;
        if(root.left == null && root.right == null) return; 
        TreeNode lst = root.left;
        TreeNode rst = root.right;
        flatten(root.left);
        flatten(root.right);
        root.left = null;
        root.right = lst;
        TreeNode temp = root;
        while(temp.right!=null) temp =temp.right;
        temp.right = rst;


    }
}
