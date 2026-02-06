package linkedlist.sll;

public class MiddleElementOfSLL_LC876 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1, 8, 9};
        Node head = createLLFromArray(nums);

//        System.out.println(findMiddleElement1(head));
        System.out.println(findMiddleElement2(head));

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

    public static int findMiddleElement1(Node head) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int mid = count / 2 + 1;
        curr = head;
        count = 1;
        while (count != mid) {
            curr = curr.next;
            count++;
        }
        return curr.data;
    }

    //Using Fast-Slow Pointer
    public static int findMiddleElement2(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null && slow!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
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
