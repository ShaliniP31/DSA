package linkedlist.sll;

public class Sort012 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
//        ListNode n4 = new ListNode(1);
//        ListNode n5 = new ListNode(0);
//        ListNode n6 = new ListNode(2);

        head.next = n2;
        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
        printLL(head);

        head = sort012(head);
        printLL(head);
    }

    public static ListNode sort012(ListNode head) {
        if (head == null | head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode zero = new ListNode(-1);
        ListNode one = new ListNode(-1);
        ListNode two = new ListNode(-1);

        ListNode zeroHead = zero;
        ListNode oneHead = one;
        ListNode twoHead = two;

        while (curr != null) {
            if (curr.val == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.val == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        zero.next = oneHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
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
