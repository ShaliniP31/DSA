package misc;

public class SLLTemplate {
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

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
