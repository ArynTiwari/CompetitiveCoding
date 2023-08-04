package LeetCode.LinkedList;

public class LLtoNum {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static int llToNum(Node head) {
        String ans = "";
        while (head != null) {
            ans += head.data;
            head = head.next;
        }
        return Integer.valueOf(ans);
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);
        head.next = first;
        first.next = second;
        second.next = null;
        int ans = llToNum(head);
        System.out.println(ans);
    }
}
