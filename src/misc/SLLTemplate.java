package misc;

public class SLLTemplate {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1};
        Node head = createLLFromArray(nums);
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
