package GFG.LinkedList.Practise;

public class MergeSort {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node merge(Node leftHead, Node rightHead) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (leftHead != null && rightHead != null) {
            if (leftHead.data <= rightHead.data) {
                current.next = leftHead;
                leftHead = leftHead.next;
            } else {
                current.next = rightHead;
                rightHead = rightHead.next;
            }
            current = current.next;
        }

        if (leftHead != null) {
            current.next = leftHead;
        } else {
            current.next = rightHead;
        }

        return dummy.next;
    }

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Divide
        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        // Sort and Merge
        Node leftSorted = mergeSort(head);
        Node rightSorted = mergeSort(slow);

        return merge(leftSorted, rightSorted);
    }

    public static void main(String[] args) {
        // Example usage
        Node head = new Node(3);
        head.next = new Node(1);
        head.next.next = new Node(4);
        head.next.next.next = new Node(2);

        Node sorted = mergeSort(head);

        // Print sorted linked list
        Node current = sorted;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
