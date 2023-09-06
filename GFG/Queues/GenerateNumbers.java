package GFG.Queues;

import java.util.*;
import java.util.Queue;

public class GenerateNumbers {
    static ArrayList<String> generate(int N) {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");
        for (int i = 0; i < N; i++) {
            String temp = q.remove();
            list.add(temp);
            q.add(temp + "0");
            q.add(temp + "1");
        }
        for (String string : list) {
            System.out.print(string + " ");
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 10;
        generate(n);
    }
}
