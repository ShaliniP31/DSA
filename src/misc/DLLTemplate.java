package misc;

public class DLLTemplate {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1, 8};
        Node head = convertArrToLL(nums);
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
