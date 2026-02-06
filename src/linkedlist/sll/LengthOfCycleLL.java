package linkedlist.sll;

import java.util.HashMap;

public class LengthOfCycleLL {
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
        n5.next = n3;

        System.out.println(lengthOfCycle2(head));
    }

    public static int lengthOfCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return 0;
        }

        HashMap<ListNode, Integer> map = new HashMap<>();
        int count = 1;
        ListNode curr = head;
        while (curr != null) {
            if (map.containsKey(curr)) {
                return count - map.get(curr);
            }
            map.put(curr, count);
            count++;
            curr = curr.next;
        }
        return 0;
    }

    public static int lengthOfCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return 0;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                int count = 1;
                while (slow.next != fast) {
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }
        return 0;
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
