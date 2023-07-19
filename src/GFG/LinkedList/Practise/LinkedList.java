package GFG.LinkedList.Practise;

class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
    void print(){
        
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        head.next = first;
        first.next = second;
        second.next = null;

    }
}