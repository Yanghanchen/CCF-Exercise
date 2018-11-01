import java.util.Stack;

public class Solution {
    Stack<Integer> stack=new Stack<>();
    int min=Integer.MAX_VALUE,lastmin=Integer.MAX_VALUE;
    
    public void push(int node) {
        stack.push(node);
        if(min>=node) {lastmin=min;min=node;}
    }

    public void pop() {
        if(min==stack.pop())
        min=lastmin;
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}