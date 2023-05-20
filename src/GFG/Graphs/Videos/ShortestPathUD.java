package GFG.Graphs.Videos;

import java.util.*;

public class ShortestPathUD {
    public static void bfs(int[][] graph, int start) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        int[] dist = new int[graph.length];
        dist[start]=0;
        Arrays.fill(dist, 0);
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            // System.out.print(vertex + " ");
            for (int neighbor : graph[vertex]) {
                if (!visited[neighbor]) {
                    dist[neighbor]=dist[vertex]+1;
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {1,2},
            {2,3},
            {0,1,3},
            {1,2}
        };
        bfs(graph, 0); // start BFS from vertex 0
    }
}