package CodingMaster.Leetcode.Meta;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class MinRemoveValidParenthesis {
    public String minRemoveToMakeValid(String s) {
        if(s.isEmpty() || s==null)
            return s;
        Set<Integer>indexToRemove=new HashSet<>();
        Deque<Integer>stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            if (s.charAt(i) == ')') {
                if(stack.isEmpty()){
                    indexToRemove.add(i);
                }
                else{
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty())
            indexToRemove.add(stack.pop());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!indexToRemove.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
