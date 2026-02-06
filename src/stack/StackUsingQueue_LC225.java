package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue_LC225 {
    private Queue<Integer> queue;

    public StackUsingQueue_LC225() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        //using 2 queues
//        Queue<Integer> rev = new LinkedList<>();
//        rev.add(x);
//        int size = queue.size();
//        int c = 0;
//        while (c != size) {
//            rev.add(queue.remove());
//            c++;
//        }
//        queue = rev;

        int size = queue.size();
        queue.add(x);
        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.element();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public void print() {
        System.out.println(queue);
    }
}
