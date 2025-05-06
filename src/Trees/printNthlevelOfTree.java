package Trees;

import java.util.Scanner;

public class printNthlevelOfTree {
	public static void printNthLevelOfTree(Node root,int level) {
		if(root == null) return;
		if(level == n) System.out.print(root.val + " ");
		printNthLevelOfTree(root.left,level + 1);
		printNthLevelOfTree(root.right,level + 1);
	}
	public static void bfsWithoutQueue(Node root,int level) {
		/*
		 *Approach: Do Nth Order Traversal for each level starting from zero
		 * and consider a loop for the levels:
		 * */
		if(root == null) return;
		if(level == n) System.out.print(root.val + " ");
		bfsWithoutQueue(root.left,level + 1);
		bfsWithoutQueue(root.right,level + 1);
	}
	static int n;
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
		System.out.println("Enter the levels to print: ");
		n = sc.nextInt();
//		printNthLevelOfTree(a,0);
		for(int i = 0;i<=3;i++) {
			n = i;
			bfsWithoutQueue(a,0);
			System.out.println();
		}
		
	}
}
