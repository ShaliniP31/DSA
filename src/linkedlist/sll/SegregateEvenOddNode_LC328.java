package linkedlist.sll;

public class SegregateEvenOddNode_LC328 {
    public static void main(String[] args) {
        //Switch based on node position, not value
        //Input: 1 2 3 4 5
        //Output: 1 3 5 2 4
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLL(head);
        head = oddEvenList(head);
        printLL(head);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
            this.next = null;
        }
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

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        ListNode curr = even.next;
        int count = 3;

        while (curr != null) {
            if (count % 2 == 1) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
            count++;
        }
        even.next = null;
        odd.next = evenHead;
        return head;
    }
}
