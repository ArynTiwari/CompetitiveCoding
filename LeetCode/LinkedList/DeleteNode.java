package LeetCode.LinkedList;

public class DeleteNode {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void deleteNode(Node node) {
        Node curr = node, prev = null;
        while (curr.next != null) {
            curr.data = curr.next.data;
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public static void printLL(Node node) {
        if (node == null) {
            System.out.println("LL is Empty");
        }
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        head.next = first;
        first.next = second;
        second.next = null;
        deleteNode(first);
        printLL(head);
    }
}
