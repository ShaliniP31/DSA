package linkedlist.dll;

public class CountElementsDLL {

    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1, 8};
        Node head = convertArrToLL(nums);
        printLL(head);

        System.out.println("\n" + countElements(head));
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

    public static int countElements(Node head) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
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
