package Trees;

class DLLConverter {
    BinaryTreeNode<Integer> head = null;
    BinaryTreeNode<Integer> prev = null;

    public void convert(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        // Traverse left subtree
        convert(root.left);

        // Process current node
        if (prev == null) {
            head = root;  // First node becomes head
        } else {
            prev.right = root;
            root.left = prev;
        }
        prev = root;

        // Traverse right subtree
        convert(root.right);
    }
}

public class Solution {
    public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
        DLLConverter converter = new DLLConverter();
        converter.convert(root);
        return converter.head;
    }
}
