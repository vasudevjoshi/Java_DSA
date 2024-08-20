package Stacks;
import java.util.*;
/*LeetCode 1047: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/*/
public class RemoveConsecutiveDuplicatesInAstring {
	    public String removeDuplicates(String s) {
	        Stack<Character> st = new Stack<Character>();
	        for(char c :s.toCharArray()){
	            if(st.isEmpty()) st.push(c);
	            else if(st.peek()!=c) st.push(c);
	            else if(st.peek()== c) st.pop();
	        }
	        StringBuilder sb = new StringBuilder("");
	        while(!st.isEmpty()) sb.append(st.pop());
	        return sb.reverse().toString();
	    }
	
}
