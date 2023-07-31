package GFG.LinkedList.Practise;

public class CircularLinkedList {
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
            newNode.next = newNode;
            return newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
            int t = head.data;
            head.data = newNode.data;
            newNode.data = t;
        }
        return head;
    }

    static Node addAtLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
        }
        /**
         * O(n) solution
         */
        // Node curr = head;
        // while (curr.next != head) {
        // curr = curr.next;
        // }
        // curr.next = newNode;
        // newNode.next = head;
        // return head;
        /**
         * O(1) by swapping
         */
        else {
            newNode.next = head.next;
            head.next = newNode;
            int t = newNode.data;
            newNode.data = head.data;
            head.data = t;
        }
        return newNode;
    }

    static void printCircular(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        Node next = head.next;
        while (next != head) {
            System.out.println(next.data);
            next = next.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = head;
        Node first = new Node(20);
        Node second = new Node(30);
        head.next = first;
        first.next = second;
        second.next = head;
        head = addInFront(head, 40);
        head = addAtLast(head, 50);
        head = addAtLast(head, 60);
        printCircular(head);
    }
}
