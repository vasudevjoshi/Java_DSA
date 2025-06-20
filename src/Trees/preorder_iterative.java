package Trees;

import java.util.List;

public class preorder_iterative {
	public static void main(String[] args) {
		Stack<TreeNode> st = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		st.push(root);
		while(st.isEmpty()) {
			TreeNode temp = st.pop();
			list.add(temp.val);
			if(temp.right!=null) st.push(temp.right);
			if(temp.left!=null ) st.push(temp.left);
		}
		return list;
	}
}
