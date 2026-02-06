package linkedlist.sll;

public class DeleteMiddleNode_LC2095 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(2);
//        ListNode n2 = new ListNode(5);
//        ListNode n3 = new ListNode(7);
//        ListNode n4 = new ListNode(1);
//        ListNode n5 = new ListNode(8);
//        head.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        ListNode head = new ListNode(1);
        printLL(head);
        head = deleteMiddleNode(head);
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

    public static ListNode deleteMiddleNode(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
