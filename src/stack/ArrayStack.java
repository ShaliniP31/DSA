package stack;

public class ArrayStack {
    private final int[] stack;
    private final int size;
    private int index = -1;

    public ArrayStack(int size) {
        this.stack = new int[size];
        this.size = size;
    }

    public void push(int val) {
        if (index == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++index] = val;
    }

    public void pop() {
        if (index == -1) {
            System.out.println("Stack is empty");
            return;
        }
        stack[index--] = 0;
    }

    public int top() {
        if (index == -1) {
            return -1;
        }
        return stack[index];
    }

    public int size() {
        return index + 1;
    }

    public void printStack() {
        for (int num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
