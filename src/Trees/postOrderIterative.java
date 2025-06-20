package Trees;

import java.util.Collections;
import java.util.List;

public class postOrderIterative {
	public static void main(String[] args) {
		Stack<TreeNode> st = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		st.push(root);
		while(st.isEmpty()) {
			TreeNode temp = st.pop();
			list.add(temp.val);
			
			if(temp.left!=null ) st.push(temp.left);
			if(temp.right!=null) st.push(temp.right);
		}
		return Collections.reverse(list);
	}
}
