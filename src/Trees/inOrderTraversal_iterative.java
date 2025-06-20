package Trees;

import java.util.List;

public class inOrderTraversal_iterative {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		TreeNode temp = root;
		while(true) {
			if(temp!=null) {
				st.push(temp)
				temp = temp.left;
			}else {
				if(st.size()  == 0) break;
				TreeNode top = st.pop();
				list.add(temp.val);
				temp = top.right();
			}
		}
		return list;
	}
}
