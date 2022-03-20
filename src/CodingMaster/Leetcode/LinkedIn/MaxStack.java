package CodingMaster.Leetcode.LinkedIn;

import java.util.Stack;

public class MaxStack {

        Stack<Integer> maxStack;
        Stack<Integer>stack;
        public MaxStack() {
            maxStack=new Stack<>();
            stack=new Stack<>();
        }

        public void push(int x) {
            int max=maxStack.isEmpty()? x : maxStack.peek();
            maxStack.push(max >x? max : x);
            stack.push(x);
        }

        public int pop() {
            maxStack.pop();
            return stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int peekMax() {
            return maxStack.peek();

        }

        public int popMax() {
            int max=peekMax();
            Stack<Integer>buffer=new Stack<>();
            while(top()!=max)
                buffer.push(pop());
            pop();

            while(!buffer.isEmpty())
                push(buffer.pop());

            return max;
        }
    }

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */

