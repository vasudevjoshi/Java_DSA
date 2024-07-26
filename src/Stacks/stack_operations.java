package Stacks;

import java.util.Scanner;

public class stack_operations {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the size of the stack");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		stack st = new stack(n);
		try {
			st.push(10);
			st.push(5);
			st.push(2);
			st.push(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
