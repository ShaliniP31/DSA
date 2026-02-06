package linkedlist.sll;

import java.util.HashMap;

public class StartOfCycleLL_LC141 {
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

        ListNode node = startNode2(head);
        System.out.println(node);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode startNode1(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode curr = head;
        while (curr != null) {
            if (map.containsKey(curr)) {
                return curr;
            }
            map.put(curr, 1);
            curr = curr.next;
        }
        return null;
    }

    public static ListNode startNode2(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
               slow = head;
               while(slow != fast){
                   slow = slow.next;
                   fast = fast.next;
               }
               return slow;
            }
        }
        return null;
    }
}
