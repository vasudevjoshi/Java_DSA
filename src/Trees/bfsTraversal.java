package Trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class bfsTraversal {
	public static void bfsTraversal(Node root) {
		Queue<Node> queue = new LinkedList<>();
		if(root == null ) return;
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp = queue.remove();
			System.out.print(temp.val + " ");
			if(temp.left != null) queue.add(temp.left);
			if(temp.right !=null) queue.add(temp.right);
		}
		System.out.println();
	}
	public static void bfsTraversalRightToLeft(Node root) {
		Queue<Node> queue = new LinkedList<>();
		if(root == null ) return;
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp = queue.remove();
			System.out.print(temp.val + " ");
			if(temp.right != null) queue.add(temp.right);
			if(temp.left !=null) queue.add(temp.left);
		}
	}
	public static int n;
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Node a = new Node(1);
		Node b = new Node(2);
		Node c =new Node(3);
		Node d = new Node(4);
		Node e =new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		a.left = b;
		a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		g.left = h;
		bfsTraversal(a);
		System.out.println("Bfs traversal from right to left: ");
		bfsTraversalRightToLeft(a);
		System.out.println("Enter the level to print: ");
		n = sc.nextInt();
		printNthLevelOfTree()
	}
}
