package queue;

public class ArrayQueue {
    private final int[] queue;
    private final int size;
    private int start = -1;
    private int end = -1;
    private int currSize = 0;

    public ArrayQueue(int size) {
        this.queue = new int[size];
        this.size = size;
    }

    public void add(int val) {
        if (currSize == size) {
            System.out.println("Queue is full");
            return;
        }
        if (start == -1) {
            start++;
        }
        if (end == size - 1) {
            end = end % (size - 1);
            queue[end] = val;
            currSize++;
            return;
        }
        queue[++end] = val;
        currSize++;
    }

    public int top() {
        if (currSize == 0) {
            return -1;
        }
        return queue[start];
    }

    public int size() {
        return currSize;
    }

    public void remove() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        if (start == size - 1) {
            queue[start] = 0;
            start = start % (size - 1);
            currSize--;
            return;
        }
        queue[start++] = 0;
        currSize--;
    }

    public void printQueue() {
        for (int num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
