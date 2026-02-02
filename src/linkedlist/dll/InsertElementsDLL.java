package linkedlist.dll;

public class InsertElementsDLL {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1, 8};
        Node head = convertArrToLL(nums);
//        Node head = null;
//        head = insertElementAtKPos(head, 56, 3);
//        head = insertElementBeforeGivenValue(head, 56, 2);
        head = insertElementAfterGivenValue(head, 56, 8);
        printLL(head);
        printLLReverse(head);
    }

    public static Node convertArrToLL(int[] nums) {
        Node head = new Node(nums[0]);
        Node prev = head;
        Node move = head;
        for (int i = 1; i < nums.length; i++) {
            Node curr = new Node(nums[i]);
            move.next = curr;
            curr.prev = prev;
            move = curr;
            prev = curr;
        }
        return head;
    }

    public static void printLL(Node head) {
        Node curr = head;
        System.out.print("[ ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print("]");
    }

    public static void printLLReverse(Node head) {
        Node curr = head;
        while (curr != null) {
            if (curr.next == null) {
                break;
            }
            curr = curr.next;
        }

        System.out.print("[ ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.print("]");
    }

    public static Node insertElementAtKPos(Node head, int v, int k) {
        if (head == null) {
            return new Node(v);
        }
        //insert at head
        if (k == 1) {
            Node curr = new Node(v);
            curr.next = head;
            head.prev = curr;
            return curr;
        }

        int count = 1;
        Node curr = head;
        Node prev = null;
        while (curr != null && count != k) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        Node insert = new Node(v);
        if (curr == null) {
            prev.next = insert;
            insert.prev = prev;
            return head;
        }

        prev.next = insert;
        insert.next = curr;
        insert.prev = prev;
        curr.prev = insert;

        return head;
    }

    public static Node insertElementBeforeGivenValue(Node head, int v, int ev) {
        if (head == null) {
            return head;
        }

        Node curr = head;
        while (curr != null) {
            if (curr.data == ev) {
                Node insert = new Node(v);
                Node prev = curr.prev;
                if (prev != null) {
                    prev.next = insert;
                    insert.prev = prev;
                    insert.next = curr;
                    curr.prev = insert;
                } else {
                    insert.next = curr;
                    curr.prev = insert;
                    head = insert;
                }

                break;
            }
            curr = curr.next;
        }
        return head;
    }

    public static Node insertElementAfterGivenValue(Node head, int v, int ev) {
        if (head == null) {
            return head;
        }

        Node curr = head;
        while (curr != null) {
            if (curr.data == ev) {
                Node insert = new Node(v);
                if (curr.next == null) {
                    curr.next = insert;
                    insert.prev = curr;
                } else {
                    Node next2 = curr.next;
                    curr.next = insert;
                    insert.next = next2;
                    insert.prev = curr;
                    next2.prev = insert;
                }
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
