package Stacks;
/*Leetcode : https://leetcode.com/problems/valid-parentheses/*/
public class ValidParenthesis {
	class Solution {
	    public boolean isValid(String s) {
	        Stack<Character> st = new Stack<Character>();
	        for(char c : s.toCharArray()){
	            if(c == '(') st.push(')');
	           else if(c == '[') st.push(']');
	            else if(c == '{') st.push('}');
	            else if(st.isEmpty() || st.pop() !=c ) return false; // this condition checks whether the closing bracket for a particular opening one must be present else give false
	        }
	        return st.isEmpty();
	    }
	}
}
