package heap;

import java.util.PriorityQueue;

public class SortKSortedLists_LC23 {
    public static void main(String[] args) {

        // Creating three linked lists:
        // list1: 1 -> 4 -> 5
        // list2: 1 -> 3 -> 4
        // list3: 2 -> 6
        // 1 1 2 3 4 4 5 6
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{list1, list2, list3};
//        ListNode head = mergeKLists1(lists);
        ListNode head = mergeKLists2(lists);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

    }

    public static ListNode mergeKLists1(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            ListNode curr = list;
            while (curr != null) {
                pq.add(curr);
                curr = curr.next;
            }
        }
        ListNode head = null;
        if (!pq.isEmpty()) {
            head = pq.remove();
            ListNode curr = head;
            while (!pq.isEmpty()) {
                curr.next = pq.remove();
                curr = curr.next;
            }
        }
        return head;
    }

    public static ListNode mergeKLists2(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {
                pq.add(list);
            }
        }
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while (!pq.isEmpty()) {
            ListNode ins = pq.remove();
            curr.next = ins;
            curr = curr.next;
            if (ins.next != null)
                pq.add(ins.next);
        }
        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
