package linkedlist.sll;

import java.util.Stack;

public class ReverseLL_LC206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(8);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLL(head);
        head = reverseList2(head);
        printLL(head);
    }


    static void printLL(ListNode head) {
        ListNode curr = head;
        System.out.print("[ ");
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public static ListNode reverseList1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            curr.val = stack.pop();
            curr = curr.next;
        }
        return head;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = curr.next;
        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }

        curr.next = prev;
        prev = curr;
        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
            this.next = null;
        }
    }
}
