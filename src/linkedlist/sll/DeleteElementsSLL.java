package linkedlist.sll;

public class DeleteElementsSLL {
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

//        head = deleteAtKPos(head, 8);
        head = deleteNodeByValue(head, 81);
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

    static ListNode deleteAtKPos(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        //remove head
        if (k == 1) {
            head = head.next;
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        int count = 1;

        while (count != k && curr != null) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        //not in ll
        if (curr == null) {
            return head;
        }

        //remove tail
        if (curr.next == null) {
            curr = prev;
            curr.next = null;
            return head;
        }

        curr.val = curr.next.val;
        curr.next = curr.next.next;

        return head;
    }

    static ListNode deleteNodeByValue(ListNode head, int v) {
        if (head == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            if (curr.val == v) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        if (curr.next == null) {
            curr = prev;
            curr.next = null;
            return head;
        }

        curr.val = curr.next.val;
        curr.next = curr.next.next;
        return head;
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
