package linkedlist.sll;

public class SearchElementSLL {
    static Node createLLFromArr(int[] nums) {
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

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] nums = {12, 3, 4, 8, 9};
        Node head = createLLFromArr(nums);

        int k = 5;
        System.out.println(search(head, k));
    }

    static boolean search(Node head, int k){
        boolean found = false;
        Node curr = head;
        while(curr!=null){
            if(curr.data == k){
                found = true;
                break;
            }
            curr = curr.next;
        }
        return found;
    }
}
