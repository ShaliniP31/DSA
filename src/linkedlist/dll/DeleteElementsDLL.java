package linkedlist.dll;

public class DeleteElementsDLL {
    public static void main(String[] args) {
        int[] nums = {2};
        Node head = convertArrToLL(nums);

//        Node head = null;
        head = deleteElementsAtPosK(head, 3);
        printLL(head);
        printLLReverse(head);

//        head = deleteByValue(head, 7);
//        printLL(head);
//        printLLReverse(head);
    }

    public static Node convertArrToLL(int[] nums) {
        Node head = new Node(nums[0]);
        Node prev = head;
        Node move = head;
        for (int i = 1; i < nums.length; i++) {
            Node curr = new Node(nums[i]);
            move.next = curr;
            curr.prev = prev;
            move = curr;
            prev = curr;
        }
        return head;
    }

    public static void printLL(Node head) {
        Node curr = head;
        System.out.print("[ ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print("]");
    }

    public static void printLLReverse(Node head) {
        Node curr = head;
        while (curr != null) {
            if (curr.next == null) {
                break;
            }
            curr = curr.next;
        }

        System.out.print("[ ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.print("]");
    }

    public static Node deleteElementsAtPosK(Node head, int k) {
        if (head == null) {
            return null;
        }

        if (k == 1) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return head;
        }

        int count = 1;
        Node curr = head;
        while (curr != null && count != k) {
            count++;
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        if (curr.next == null) {
            Node end = curr.prev;
            end.next = null;
            curr.prev = null;
            return head;
        }

        Node remove = curr;
        curr = curr.prev;
        curr.next = remove.next;
        curr = curr.next;
        curr.prev = remove.prev;

        return head;
    }

    public static Node deleteByValue(Node head, int v) {
        if (head == null) {
            return head;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.data == v) {
                Node remove = curr;
                curr = remove.prev;
                curr.next = remove.next;
                curr = curr.next;
                curr.prev = remove.prev;
                return head;
            }
            curr = curr.next;
        }
        return head;
    }

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
