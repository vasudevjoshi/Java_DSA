package Doubly_Linkedlist;
import java.util.*;
public class Doubly_Linked_list_Main extends DLL{
	public static void main(String[] args) {
		DLL list = new DLL();
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			list.insertattail(sc.nextInt());
		}
//		for(int i = 0;i<n;i++) {
//			list.insertathead(sc.nextInt());
//		}
		list.print(list.head);
		list.printInReverse(list.tail);
		list.printsize();
		System.out.println();
		list.insertatindex(3, 100);
		list.print(list.head);
		
		
		list.deleteathead();
		list.print(list.head);
		list.deleteattail();
		list.print(list.head);
		list.deleteatindex(2);
		list.print(list.head);
		
		list.get(2, list.head);
		list.print(list.head);
		list.set(2, 890, list.head);
		list.print(list.head);
		
	}
}
