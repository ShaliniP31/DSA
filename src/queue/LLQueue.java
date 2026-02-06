package queue;

public class LLQueue {
    private ListNode start;
    private ListNode end;
    private int size;
    private int index = -1;

    LLQueue(int size) {
        start = null;
        end = null;
        this.size = size;
    }

    public void add(int val) {
        if (index + 1 == size) {
            System.out.println("Queue is full");
            return;
        }
        ListNode ins = new ListNode(val);
        if (start == null) {
            start = ins;
            end = ins;
            index++;
            return;
        }
        end.next = ins;
        end = end.next;
        index++;
    }

    public void remove() {
        if (index == -1) {
            System.out.println("Queue is empty");
            return;
        }
        ListNode temp = start;
        start = start.next;
        temp.next = null;
        index--;
    }

    public int top() {
        return start.val;
    }

    public int size() {
        return index + 1;
    }

    public void printQueue() {
        ListNode curr = start;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
