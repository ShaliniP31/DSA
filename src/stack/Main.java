package stack;

public class Main {
    public static void main(String[] args) {
//        arrayStackImpl();
//        llStackImpl();
//        stackUsingQueueImpl();
        minStackImpl();
    }

    public static void arrayStackImpl() {
        ArrayStack stack = new ArrayStack(4);
        stack.pop();
        stack.push(5);
        stack.printStack();
        stack.push(4);
        stack.printStack();
        System.out.println(stack.top());
        System.out.println(stack.size());
        stack.push(10);
        stack.printStack();
        stack.push(14);
        stack.printStack();
        stack.push(45);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println(stack.top());
        System.out.println(stack.size());
    }

    public static void llStackImpl() {
        LLStack stack = new LLStack(4);
        System.out.println(stack.top());
        stack.pop();
        stack.push(88);
        System.out.println(stack.top());
        System.out.println(stack.size());
        stack.printStack();
        stack.push(54);
        stack.push(99);
        stack.push(32);
        stack.push(11);
        stack.printStack();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
        stack.printStack();
        stack.push(77);
        stack.printStack();
    }

    public static void stackUsingQueueImpl() {
        StackUsingQueue_LC225 sq = new StackUsingQueue_LC225();
        sq.push(10);
        sq.push(122);
        sq.push(65);
        sq.print();
        sq.pop();
        System.out.println(sq.top());
        sq.print();
    }

    public static void minStackImpl(){
        MinStack_LC155 stack = new MinStack_LC155();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }
}
