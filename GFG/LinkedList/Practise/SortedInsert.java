package GFG.LinkedList.Practise;

public class SortedInsert {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node addSorted(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            if (head.data > newNode.data) {
                newNode.next = head;
                return newNode;
            } else {
                Node curr = head;
                while (curr.next != null && curr.next.data < newNode.data) {
                    curr = curr.next;
                }
                newNode.next = curr.next;
                curr.next = newNode;
            }
        }
        return head;
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
        Node head = null;
        head = addSorted(head, 10);
        head = addSorted(head, 5);
        head = addSorted(head, 4);
        head = addSorted(head, 20);
        head = addSorted(head, 15);
         head = addSorted(head, 17);
        printLL(head);
    }
}
