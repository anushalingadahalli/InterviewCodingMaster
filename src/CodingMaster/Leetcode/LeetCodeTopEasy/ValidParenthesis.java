package CodingMaster.Leetcode.LeetCodeTopEasy;/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.


        Example 1:

        Input: s = "()"
        Output: true
        Example 2:

        Input: s = "()[]{}"
        Output: true
        Example 3:

        Input: s = "(]"
        Output: false*/

import java.util.Stack;

public class ValidParenthesis {

        public boolean isValid(String s) {
            Stack<Character> st = new Stack();
            for(char c:s.toCharArray()){
                if(c=='(' || c=='{' || c=='['){
                    st.push(c);}
                if(c==')' && !st.isEmpty() && st.peek()=='('){
                    st.pop();}
                else if(c=='}' && !st.isEmpty() && st.peek()=='{'){

                    st.pop();}
                else if(c==']' && !st.isEmpty() && st.peek()=='['){
                    st.pop();}

            }
            return st.isEmpty();
        }

}
