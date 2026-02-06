package linkedlist.sll;

import java.util.Stack;

public class CheckPalindrome_LC234 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(1);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println(isPalindrome2(head));
//        System.out.println(isPalindrome1(head));
    }

    public static ListNode reverse1(ListNode rev) {
        if (rev == null || rev.next == null) {
            return rev;
        }
        ListNode curr = rev;
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

    public static boolean isPalindrome2(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }
        Stack<Integer> stack = reverse2(slow);
        ListNode curr = head;
        while (!stack.isEmpty()) {
            if (stack.peek() == curr.val) {
                stack.pop();
                curr = curr.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public static Stack<Integer> reverse2(ListNode rev) {
        Stack<Integer> stack = new Stack<>();
        while (rev != null) {
            stack.push(rev.val);
            rev = rev.next;
        }
        return stack;
    }

    public static boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }
        ListNode rev = reverse1(slow);
        ListNode curr = head;
        while (rev != null) {
            if (rev.val == curr.val) {
                rev = rev.next;
                curr = curr.next;
            } else {
                return false;
            }
        }
        return true;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
