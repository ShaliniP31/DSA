package linkedlist.dll;

import java.util.Stack;

public class ReverseDLL {

    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1, 8};
        Node head = convertArrToLL(nums);
        printLL(head);

//        System.out.println("\n\nApproach with Stack");
//        head = reverseUsingStack(head);
//        printLL(head);

        System.out.println("\n\nApproach with LinkedList pointer swapping");
        head = reverseBySwappingPointer(head);
        printLL(head);
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

    public static Node reverseUsingStack(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node curr = head;
        while (curr != null) {
            stack.push(curr.data);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            curr.data = stack.pop();
            curr = curr.next;
        }
        return head;
    }

    public static Node reverseBySwappingPointer(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node swap = null;
        while (curr != null) {
            swap = curr.prev;
            curr.prev = curr.next;
            curr.next = swap;
            curr = curr.prev;
        }
        return swap.prev;
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
