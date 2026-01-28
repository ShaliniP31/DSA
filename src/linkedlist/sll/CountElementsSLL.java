package linkedlist.sll;

public class CountElementsSLL {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1};
        Node head = createLLFromArray(nums);
//        System.out.println(head.data);

//        traverse(head);
        System.out.println("LL count:" +count(head));
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

    static void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    static int count(Node head) {
        Node curr = head;
        int count =0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

