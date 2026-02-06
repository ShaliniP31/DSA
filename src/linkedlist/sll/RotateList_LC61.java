package linkedlist.sll;

public class RotateList_LC61 {
    public static void main(String[] args) {
        String s = "1 2 4-2";
        String[] parts = s.trim().split("-");
        String[] vals = parts[0].trim().split("\\s+");
        int k = Integer.parseInt(parts[1].trim());

        ListNode head = new ListNode(Integer.parseInt(vals[0]));
        ListNode move = head;
        for (int i = 1; i < vals.length; i++) {
            ListNode curr = new ListNode(Integer.parseInt(vals[i]));
            move.next = curr;
            move = curr;
        }

        printLL(head);
        head = rotateRight(head, k);
        printLL(head);
    }

    public static void printLL(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode curr = head;
        int n = 0;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        k = k % n;
        if (k == 0)
            return head;
        curr = head;

        n = n - k;
        int count = 0;
        ListNode prev = null;
        while (count != n) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = null;
        ListNode newHead = curr;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        return newHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.next = null;
            this.val = val;
        }
    }
}
