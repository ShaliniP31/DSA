package queue;

import java.util.Stack;

public class QueueUsingStack_LC232 {
    private Stack<Integer> stack;

    public QueueUsingStack_LC232() {
        stack = new Stack<>();
    }

    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty())
            temp.add(stack.pop());
        stack.add(x);
        while(!temp.isEmpty())
            stack.add(temp.pop());
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public void print() {
        System.out.println(stack);
    }
}
