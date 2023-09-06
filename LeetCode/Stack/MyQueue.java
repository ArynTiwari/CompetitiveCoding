package LeetCode.Stack;

import java.util.*;

class MyQueue {
    Deque<Integer> in;
    Deque<Integer> out;
    int peekEle = -1;

    public MyQueue() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    public void push(int x) {
        if (in.isEmpty()) {
            peekEle = x;
        }
        in.push(x);
        // in me dalo
    }

    public int pop() {
        // check out, if not empty then return,else in se dalo out me
        if (out.isEmpty()) {
            while (in.isEmpty()) {
                out.push(in.pop());
            }
        }
        int val = out.peek();// O(1)
        out.pop();
        return val;
    }

    public int peek() {
        // if out is empty return peek el.se out.peek()
        if (out.isEmpty()) {
            return peekEle;
        }
        return out.peek();
    }

    public boolean empty() {
        // out and in is empty -> return true
        return in.isEmpty() && out.isEmpty();
    }

    public void printQueue(MyQueue q) {
        while (!q.empty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(0);
        queue.printQueue(queue);

    }
}
