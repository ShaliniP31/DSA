package linkedlist.sll;

public class DeleteGivenNode_LC237 {
    public static void main(String[] args) {

        Node head = new Node(2);
        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(7);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        printLL(head);

        System.out.println("After delete: ");
        deleteNode(n1);
        printLL(head);
    }

    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
