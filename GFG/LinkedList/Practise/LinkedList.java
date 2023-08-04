package GFG.LinkedList.Practise;

import java.util.HashMap;

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

    public static Node insertInMid(Node head, int data) {
        // Insert code here, return the head of modified linked list
        Node fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node newNode = new Node(data);
        newNode.next = slow.next;
        slow.next = newNode;
        return head;
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

    public static Node removeNthFromEnd(Node head, int n) {

        Node fast = head, slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null)
            return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        System.out.print(slow.data);
        return head;
    }

    public static int midOfLL(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static Node deleteFromEnd(Node head) {
        if (head == null) {

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

    public static Node recursiveReverse(Node curr, Node prev) {
        if (curr == null)
            return prev;
        Node next = curr.next;
        curr.next = prev;
        return recursiveReverse(next, curr);
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
        if (head == null || head.next == null) {
            return head;
        }
        Node odd = head, even = head.next, evenStart = head.next;
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
        if (k == (n - k + 1)) {
            return head;
        }
        Node start = head, start_prev = null;
        for (int i = 1; i < k; i++) {
            start_prev = start;
            start = start.next;
        }
        Node end = head, end_prev = null;
        for (int i = 1; i < n - k + 1; i++) {
            end_prev = end;
            end = end.next;
        }
        if (start_prev != null) {
            start_prev.next = end;
        }
        if (end_prev != null) {
            end_prev.next = start;
        }
        Node temp = start.next;
        start.next = end.next;
        end.next = temp;
        if (k == 1) {
            head = end;
        }
        if (k == n) {
            head = start;
        }
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

    public static Node reverseInKGroup(Node head, int k) {
        int n = llSize(head);
        int loop = (int) (n / k);
        Node curr = head, prevFirst = null;
        boolean isFirstPass = true;
        while (loop > 0 && curr != null) {
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
            prevFirst.next = curr;
            loop--;
        }
        System.out.println(prevFirst.data+" "+ curr.data);
        return head;
    }

    static Node mergeTwoLinkedList(Node l1, Node l2) {
        if (l2 == null) {
            return l1;
        }
        if (l1 == null) {
            return l2;
        }
        if (l1.data <= l2.data) {
            l1.next = mergeTwoLinkedList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLinkedList(l1, l2.next);
            return l2;
        }
    }

    static Node mergeKList(Node[] arr, int k) {
        for (int i = 0; i < k - 1; i++) {
            Node head = mergeTwoLinkedList(arr[i], arr[i + 1]);
            arr[i + 1] = head;
        }
        return arr[k - 1];
    }

    static Node cloneWithRandom(Node head) {
        return head;
    }

    static Node lruCache(Node head) {
        /**
         * If the new element not in cache, we call it a miss;
         * else we call it a hit;
         * Most recently in in front, that is the element coming after are at front
         * Always remove the least recenlty used(last most element)
         * Design a data structure to support such functionality
         * When using array, both hit and miss will take O(n) space
         * Efficient Algo
         * Use HashTable+Doubly Linked List
         * 
         */

        return head;
    }

    static int interSection(Node h1, Node h2) {

        /**
         * Get size of both
         * Travere bigger Node by abs(s1-s2);
         * Now traverse both simultaneously
         * If they point to same node, it is our answer
         */
        int s1 = llSize(h1);
        int s2 = llSize(h2);
        // System.out.println(s1+" "+s2);
        Node bigger = null, smaller = null;
        if (s1 > s2) {
            bigger = h1;
            smaller = h2;
        } else {
            bigger = h2;
            smaller = h1;
        }
        // System.out.println(bigger.data+" "+smaller.data);
        int jum = Math.abs(s1 - s2);
        for (int i = 1; i <= jum; i++) {
            bigger = bigger.next;
        }
        // System.out.println("After shift "+ bigger.data);
        while (bigger != null && smaller != null) {
            if (bigger == smaller) {
                return bigger.data;
            }
            bigger = bigger.next;
            smaller = smaller.next;
        }
        return -1;
    }

    static Node evenOddData(Node head) {
        Node evenStart = null, evenEnd = null, oddStart = null, oddEnd = null;
        for (Node curr = head; curr != null; curr = curr.next) {
            int x = curr.data;
            if (x % 2 == 0) {
                if (evenStart == null) {
                    evenStart = curr;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
        }
        if (oddStart == null || evenStart == null)
            return head;
        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;

    }

    static Node addNumber(Node h1, Node h2) {
        Node s1 = recursiveReverse(h1, null);
        Node s2 = recursiveReverse(h2, null);
        Node ret = new Node(0);
        Node ans = ret;
        int carr = 0;
        while (s1 != null || s2 != null || carr != 0) {
            int a = s1 != null ? s1.data : 0;
            int b = s2 != null ? s2.data : 0;
            int sum = a + b + carr;
            Node newNode = new Node(sum % 10);
            carr = sum / 10;
            ans.next = newNode;
            ans = ans.next;
            s1 = (s1 != null) ? s1.next : null;
            s2 = (s2 != null) ? s2.next : null;
        }
        if (ret.next == null) {
            return ret;
        }
        ret = ret.next;
        Node finalAns = recursiveReverse(ret, null);
        return finalAns;
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
        Node fast = head, slow = head, start = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast != slow) {
            return;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        start = slow;
        while (start.next != slow) {
            start = start.next;
        }
        start.next = null;
    }

    public static Node deleteDuplicate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public Node removeZeroSumSublists(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        HashMap<Integer, Node> mp = new HashMap<>();
        mp.put(0, dummy);
        int prefixSum = 0;
        while (head != null) {
            prefixSum += head.data;
            if (mp.containsKey(prefixSum)) {
                Node start = mp.get(prefixSum);
                Node temp = start;
                int pSum = prefixSum;
                while (temp != head) {
                    temp = temp.next;
                    pSum += temp.data;
                    if (temp != head) {
                        mp.remove(pSum);
                    }
                }
                start.next = head.next;
            } else {
                mp.put(prefixSum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static Node rotate(Node head, int k) {
        // add code here
        Node curr = head, origHead = head, newHead = null, lastNode = null, newLastNode = null;
        while (curr.next != null) {
            curr = curr.next;
        }
        lastNode = curr;
        curr = head;
        int i = 0;
        while (curr != null && i < k - 1) {
            curr = curr.next;
            i++;
        }
        if (curr == lastNode) {
            return head;
        }
        if (curr != null) {
            newLastNode = curr;
            newHead = curr.next;
            newLastNode.next = null;
        } else {
            return head;
        }
        lastNode.next = origHead;
        return newHead;
    }

    static boolean isPalindrome(Node h) {
        // Your code here
        Node newNode = reverseLL(h);
        while (h != null) {
            if (h.data != newNode.data) {
                return false;
            }
            h = h.next;
            newNode = newNode.next;
        }
        return true;
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
        // printLL(head);
        System.out.println("");
        System.out.println("After function:");
        // head = recursiveReverse(head, null);
        // head = evenOddData(head);
        // head = swapkthnode(head, 6, 1);
        // removeLoop(head);
        // head = deleteDuplicate(head);
        // head = insertInMid(head, 10);
        // System.out.println(isPalindrome(head));
        head = reverseInKGroup(head, 4);
        printLL(head);
        System.out.println();
    }

}