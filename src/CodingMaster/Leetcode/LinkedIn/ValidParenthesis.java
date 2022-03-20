package CodingMaster.Leetcode.LinkedIn;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] input = s.toCharArray();
        int i = 0;
        while (i < input.length) {
            if (stack.empty()) {
                stack.push(input[i]);
            } else {
                char element = (char) stack.peek();
                if (element == '{' && input[i] == '}') {
                    stack.pop();
                } else if (element == '(' && input[i] == ')') {
                    stack.pop();
                } else if (element == '[' && input[i] == ']') {
                    stack.pop();
                } else {
                    stack.push(input[i]);
                }
            }
            i++;
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
