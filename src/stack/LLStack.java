package stack;

public class LLStack {
    private ListNode top;
    private final int size;
    private int index = -1;

    LLStack(int size) {
        top = null;
        this.size = size;
    }

    public void push(int val) {
        if (index == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        ListNode ins = new ListNode(val);
        ins.next = top;
        top = ins;
        index++;
    }

    public int top() {
        return top.val;
    }

    public int size() {
        return index + 1;
    }

    public void printStack() {
        ListNode curr = top;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void pop() {
        if (index == -1) {
            System.out.println("Stack is empty");
            return;
        }
        ListNode prev = top;
        top = top.next;
        prev.next = null;
        index--;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
