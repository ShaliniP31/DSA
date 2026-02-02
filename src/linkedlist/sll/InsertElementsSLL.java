package linkedlist.sll;

public class InsertElementsSLL {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1, 8};
        Node head = createLLFromArray(nums);

//        Node head = null;
//        head = insertAtKPos(head, 56, 9);
//        head = insertBeforeGivenValue(head, 56, 71);
        head = insertAfterGivenValue(head, 56, 7);
        printLL(head);
    }

    static Node createLLFromArray(int[] nums) {
        Node head = new Node(nums[0]);
        Node move = head;
        for (int i = 1; i < nums.length; i++) {
            Node curr = new Node(nums[i]);
            move.next = curr;
            move = curr;
        }
        return head;
    }

    static void printLL(Node head) {
        Node curr = head;
        System.out.print("[ ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print("]");
    }

    static Node insertAtKPos(Node head, int v, int p) {
        if (head == null) {
            return new Node(v);
        }

        //insert at head
        if (p == 1) {
            Node curr = new Node(v);
            curr.next = head;
            return curr;
        }
        int count = 1;
        Node curr = head;
        Node prev = null;
        while (count != p && curr != null) {
            count++;
            prev = curr;
            curr = curr.next;
        }

        Node insert = new Node(v);
        if (curr == null) {
            prev.next = insert;
            return head;
        }
        prev.next = insert;
        insert.next = curr;
        return head;
    }


    //ev is value existing in the ll, add before the ev only.
    static Node insertBeforeGivenValue(Node head, int v, int ev) {
        if (head == null) {
            return null;
        }

        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data == ev) {
                Node insert = new Node(v);
                insert.next = curr.next;
                curr.next = insert;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    static Node insertAfterGivenValue(Node head, int v, int ev) {
        if (head == null) {
            return null;
        }

        Node curr = head;
        while (curr != null) {
            if (curr.data == ev) {
                Node insert = new Node(v);
                insert.next = curr.next;
                curr.next = insert;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
