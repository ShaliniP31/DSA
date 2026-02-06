package queue;

public class Main {
    public static void main(String[] args) {
//        arrayQueueImpl();
//        llQueueImpl();
        queueUsingStackImpl();
    }

    public static void arrayQueueImpl() {
        ArrayQueue queue = new ArrayQueue(4);
        queue.remove();
        queue.add(5);
        queue.printQueue();
        queue.add(7);
        System.out.println(queue.top());
        System.out.println(queue.size());
        queue.printQueue();
        queue.remove();
        System.out.println(queue.top());
        System.out.println(queue.size());
        queue.printQueue();
        queue.add(12);
        queue.add(76);
        queue.add(33);
        queue.printQueue();
        System.out.println(queue.top());
        System.out.println(queue.size());

        queue.add(66);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println(queue.top());
        System.out.println(queue.size());
        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println(queue.top());
        System.out.println(queue.size());
        queue.add(77);
        queue.printQueue();
    }

    public static void llQueueImpl() {
        LLQueue queue = new LLQueue(4);
        queue.remove();
        queue.add(77);
        queue.printQueue();
        queue.add(87);
        queue.printQueue();
        System.out.println(queue.size());
        System.out.println(queue.top());
        queue.add(2);
        queue.add(73);
        queue.add(44);
        System.out.println(queue.size());
        queue.remove();
        queue.add(44);
        queue.printQueue();
        System.out.println(queue.top());
    }

    public static void queueUsingStackImpl() {
        QueueUsingStack_LC232 qs = new QueueUsingStack_LC232();
        qs.push(10);
        System.out.println(qs.peek());
        qs.push(122);
        System.out.println(qs.peek());
        qs.push(65);
        qs.print();
        qs.pop();
        System.out.println(qs.peek());
        qs.print();
    }
}
