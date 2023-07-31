package GFG.LinkedList.Practise;

public class DoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int x) {
            data = x;
            prev = null;
            next = null;
        }
    }

    static Node addInFront(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        head.prev = newNode;
        newNode.next = head;
        newNode.prev = null;
        return newNode;
    }

    static Node addInLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        return head;
    }

    // add after the given position
    static Node addAtIndex(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }

        newNode.prev = curr;
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node curr = head, prev = null;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }

    static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        head.prev = null;
        head.next = first;
        first.prev = head;
        first.next = second;
        second.prev = first;
        second.next = null;
        head = addInFront(head, 0);
        head = addInFront(head, -1);
        head = addInLast(head, 40);
        head = addAtIndex(head, 15, 4);
        // head = reverseLinkedList(head);
        printLL(head);
    }
}
