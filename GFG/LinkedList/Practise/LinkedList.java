package GFG.LinkedList.Practise;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node addInFront(Node node, int data) {
        Node newNode = new Node(data);
        newNode.next = node;
        return newNode;
    }

    public static void addInLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
    }

    public static int llSize(Node head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public static Node insertAtIndex(Node head, int data, int pos) {
        Node curr = head;
        Node prev = null;
        int size = llSize(head);
        if (pos > size || pos < 0) {
            System.out.println("Invalid pos");
            return head;
        }
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        for (int i = 0; i < pos; i++) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;
        return head;
    }

    public static Node deleteFromStart(Node head) {
        if (head == null) {
            new Error("Node is null.", null);
        }
        return head.next;
    }

    public static int midOfLL(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static Node deleteFromEnd(Node head) {
        if (head == null) {
            System.out.println("From DeleteFromEnd : LL is Empty");
            return head;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head.next, prev = head;
        while (curr != null) {
            Node frw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frw;
        }
        head.next = null;
        head = prev;
        return head;
    }

    public static int searchLL(Node head, int x) {
        int pos = 1;
        Node curr = head;
        if (head == null) {
            return -1;
        }
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }

        }
        return -1;
    }

    public static void deleteFromGivenNode(Node del) {
        Node curr = del, prev = null;
        while (curr.next != null) {
            curr.data = curr.next.data;
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public static Node evenOdd(Node head) {
        Node odd = head, even = head.next, evenStart = head.next;
        if (head == null || head.next == null) {
            return head;
        }
        while (even != null) {
            odd.next = even.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenStart;
        return head;
    }

    public static Node swapkthnode(Node head, int n, int k) {
        if (head == null) {
            return null;
        }
        if (k > n) {
            return head;
        }
        Node last = null, slow = head, fast = head, first = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        last = slow;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        int temp = first.data;
        first.data = last.data;
        last.data = temp;
        return head;
    }

    public static Node reverseInPair(int k, Node head) {
        Node curr = head, prevFirst = null;
        boolean isFirstPass = true;
        while (curr != null) {
            Node first = curr, prev = null;
            int count = 0;
            while (curr != null && count < k) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if (isFirstPass) {
                head = prev;
                isFirstPass = false;
            } else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
    }

    static Node mergeLinkedList(Node head) {

        return head;
    }

    static Node evenOddData(Node head) {
        return head;
    }

    static Node addNumber(Node head) {

        return head;
    }

    public static int loopAndLenght(Node head) {
        int count = 0;
        if (head == null || head.next == null) {
            return count;
        }
        Node fast = head, slow = head, p = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast != slow) {
            return count;
        }
        while (p != slow) {
            slow = slow.next;
            p = p.next;
        }
        Node itr = slow.next;
        while (itr != slow) {
            itr = itr.next;
            count++;
        }
        return count + 1;
    }

    public static void removeLoop(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow != fast) {
            System.out.println("No loop found!");
        } else {
            Node start = head;
            while (start != slow) {
                start = start.next;
                slow = slow.next;
            }
            System.out.println("Loop found at:- " + start.data);
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }

    public static void printLL(Node node) {
        if (node == null) {
            System.out.println("LL is Empty");
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);
        Node fifth = new Node(6);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        // head = addInFront(head, 0);
        // addInLast(head, 60);
        // addInLast(head, 70);
        // addInLast(head, 80);
        // head = insertAtIndex(head, 5, 0);
        // head = insertAtIndex(head, 90, 8);
        // head = deleteFromStart(head);
        // head = deleteFromStart(head);
        // head = insertAtIndex(head, 50, 2);
        // head = deleteFromEnd(head);
        // head = deleteFromEnd(head);
        // head = reverseLL(head);
        // System.out.println("Original ll is:- ");
        // printLL(head);
        // System.out.println("");
        // System.out.println("");
        // System.out.println("Size of ll:- " + llSize(head));
        // System.out.println("Index of element 50 is:- " + searchLL(head, 50));
        // System.out.println("Middle element is:- " + midOfLL(head));
        // deleteFromGivenNode(head);
        // head = evenOdd(head);
        // head = swapkthnode(head, 4, 1);
        // head = reverseInPair(2, head);
        System.out.println("After function:");
        addNumber(head);
        printLL(head);
        System.out.println();
    }

}