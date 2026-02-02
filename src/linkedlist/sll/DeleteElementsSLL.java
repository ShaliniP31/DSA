package linkedlist.sll;

public class DeleteElementsSLL {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1, 8};
        Node head = createLLFromArray(nums);

//        Node head = null;
        head = deleteAtKPos(head, 3);
//        printLL(head);

//        System.out.println();
//        head = deleteNodeByValue(head, 81);
        printLL(head);
    }

    static Node createLLFromArray(int[] nums) {
        Node head = new Node(nums[0]);
        Node move = head;
        for (int i = 1; i < nums.length; i++) {
            Node curr = new Node(nums[i]);
            move.next = curr;
            move = curr;
        }
        return head;
    }

    static void printLL(Node head) {
        Node curr = head;
        System.out.print("[ ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print("]");
    }

    static Node deleteAtKPos(Node head, int k) {
        if (head == null) {
            return head;
        }
        //remove head
        if (k == 1) {
            head = head.next;
            return head;
        }

        Node curr = head;
        Node prev = null;
        int count = 1;

        while (count != k && curr != null) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        //not in ll
        if (curr == null) {
            return head;
        }

        //remove tail
        if (curr.next == null) {
            curr = prev;
            curr.next = null;
            return head;
        }

        curr.data = curr.next.data;
        curr.next = curr.next.next;

        return head;
    }

    static Node deleteNodeByValue(Node head, int v) {
        if (head == null)
            return head;

        Node curr = head;
        Node prev = null;
        while (curr != null) {
            if (curr.data == v) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        if (curr.next == null) {
            curr = prev;
            curr.next = null;
            return head;
        }

        curr.data = curr.next.data;
        curr.next = curr.next.next;
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
