package linkedlist.sll;

public class InsertElementsSLL {
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

//        head = insertAtKPos(head, 56, 61);
//        head = insertAfterGivenValue(head, 56, 81);
        head = insertBeforeGivenValue(head, 56, 2);
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

    static ListNode insertAtKPos(ListNode head, int v, int p) {
        if (head == null) {
            return new ListNode(v);
        }

        //insert at head
        if (p == 1) {
            ListNode curr = new ListNode(v);
            curr.next = head;
            return curr;
        }
        int count = 1;
        ListNode curr = head;
        ListNode prev = null;
        while (count != p && curr != null) {
            count++;
            prev = curr;
            curr = curr.next;
        }

        ListNode insert = new ListNode(v);
        if (curr == null) {
            prev.next = insert;
            return head;
        }
        prev.next = insert;
        insert.next = curr;
        return head;
    }

    //ev is value existing in the ll, add before the ev only.
    static ListNode insertBeforeGivenValue(ListNode head, int v, int ev) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == ev) {
                ListNode insert = new ListNode(v);
                insert.next = curr.next;
                curr.next = insert;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    static ListNode insertAfterGivenValue(ListNode head, int v, int ev) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        while (curr != null) {
            if (curr.val == ev) {
                ListNode insert = new ListNode(v);
                insert.next = curr.next;
                curr.next = insert;
                break;
            }
            curr = curr.next;
        }
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
