package Trees;

public class TreeImplementation  {
	private static void print(Node root) {
		if(root == null)
				return;
		System.out.print(root.val + " ");
		print(root.left);
		print(root.right);
	}
	private static int sum(Node root) {
		if(root == null)
				return 0;
		 return root.val + sum(root.left) + sum(root.right);
		
	}
	private static int product(Node root) {
		if(root == null)
				return 1;
		 return root.val * product(root.left) * product(root.right);
		
	}
	private static int productwithNoneZeros(Node root) {
	    // If the root is null, return 1 (neutral element for multiplication)
	    if (root == null) 
	        return 1;
	    
	    // If the value of the node is 0, return 1 to ignore 0s
	    if (root.val == 0) 
	        return 1;

	    // Recursively multiply the value of the node with the product of the left and right subtrees
	    return root.val * productwithNoneZeros(root.left) * productwithNoneZeros(root.right);
	}
	private static int max(Node root) {
		return 0;
	}
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b= new Node(2);
		Node c = new Node(3);
		Node d = new Node(0);
		Node e = new Node(5);
		Node f = new Node(6);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		System.out.println("Printing The tree Nodes: ");
		print(a);
		System.out.println("\nPrinting the sum of the Nodes in a tree: ");
		System.out.println(sum(a) + " ");
		System.out.println("\nPrinting the product of the Nodes in a tree: ");
		System.out.println(product(a) + " ");
		System.out.println("\nPrinting the product  of the Non Nodes in a tree: ");
		System.out.println(productwithNoneZeros(a) + " ");
	}
}
