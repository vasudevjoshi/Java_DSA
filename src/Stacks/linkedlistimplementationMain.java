package Stacks;

public class linkedlistimplementationMain {
	public static void main(String[] args) {
		stackll st = new stackll();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.pop();
		System.out.println(st.peek()); 
		System.out.println(st.size());
		st.display(st.head);
		
	}
}
