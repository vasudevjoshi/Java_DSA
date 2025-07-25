package TwoDimensionarrays;
import java.util.*;
public class TwoDArraylistfunctions {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> a  = new ArrayList<>();
	a.add(10); a.add(20); a.add(50);
	ArrayList<Integer> b  = new ArrayList<>();
	b.add(20); b.add(10); b.add(30);
	ArrayList<Integer> c  = new ArrayList<>();
	ArrayList<Integer> d  = new ArrayList<>();
	d.add(23);d.add(89);
	// declaring a two dimensional arraylist with each of its members as list it means 
	// each member is a return a list rather a number.
	List<List<Integer>>  l = new ArrayList<>();
	// this declares a two dimensional array list in which each element is 
	// list of variable size;
	/* to add the items in the two dimensional array list we simply give a single 
	 * dimensional array as a parameter to its add function which shown below*/
//	d.add(100);// this gives error since it accepts the list as parameter not numbers
	// we change it as 
	l.add(a);
	l.add(b);
	l.add(c);
	l.add(d);
	
	// to  print the elements of the two d arraylist 
	for(int i = 0;i<a.size();i++) {
		System.out.print(a.get(i)+ " ");
	}System.out.println();
	
	// output of the above statement : 10 20 50 prints the elements of the 
	// list a,similarly for the list as well 
	for(int i = 0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	/*
	 * the above line prints the entire list as shown:
	 * [10, 20, 50]
	[20, 10, 30]
	[]
	[23, 89]
	but if we access an individual element in the list we do l.get(i).get(i) this fetches the ith element in the ith row of the two d arraylist ex:*/
	System.out.println(l.get(0).get(0));
	/*prints the elements of 0th row and zeroth column
	 * output: 10 
	 */
	/*to print the elements in the array form as it was added to list we create an 
	 * dummy variable list that holds the list and prints the elements of that list
	 * */
	for(int i = 0;i<l.size();i++) {
		List<Integer> x = l.get(i);
		for(int j = 0;j<x.size();j++) {
			System.out.print(x.get(j)+ " ");
		}System.out.println();
		
	}
	/*Output: 
	 * 	10 20 50 
		20 10 30 

		23 89
		here we create an dummy variable x of king arraylist,this basically individual
		lists of the two d arraylist l. Now to access each element we use this x var to print the elemenest
		this is done bcoz each list in the l do not have same size so that we cannot use a common row or column number.
	 */
	for(int i = 0;i<l.size();i++) {
		//List<Integer> x = l.get(i);
		for(int j = 0;j<l.get(i).size();j++) {
			System.out.print(l.get(i).get(j)+ " ");
		}System.out.println();
	}
	/*Output:
	 * 10 20 50 
		20 10 30 

		23 89 
	 * */
	l.clear();// this clears list i.e emptys the list
	for(int i = 0;i<l.size();i++) {
		//List<Integer> x = l.get(i);
		for(int j = 0;j<l.get(i).size();j++) {
			System.out.print(l.get(i).get(j)+ " ");
		}System.out.println();
	}
	}
}
