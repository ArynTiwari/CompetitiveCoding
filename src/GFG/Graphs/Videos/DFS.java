package GFG.Graphs.Videos;
import java.util.*;
public class DFS {
    static void dfs(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result, boolean[] visited, int i){
        visited[i]=true;
        result.add(i);
        for(int v: adj.get(i)){
            if(!visited[v]){
                dfs(adj, result, visited, v);
            }
        }

    }
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>result=new ArrayList<>(V);
        boolean[] visited = new boolean[V];
        for (int ind = 0; ind< V; ind++) {
            visited[ind]=false;
        }
        for (int i = 0; i <V; i++) {
            if(!visited[i]){
                dfs(adj, result, visited,i);
            }
        }
        return result;


    }
    public static void main(String[] args) {
        int n = 6; // number of nodes
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(0).add(3);
        graph.get(1).add(3);
        graph.get(1).add(5);
        graph.get(2).add(3);
        graph.get(2).add(4);
        graph.get(3).add(4);
        graph.get(3).add(5);
        graph.get(4).add(5);
       ArrayList<Integer> ans = dfsOfGraph(n, graph);
       for (Integer integer : ans) {
        System.out.print(integer+" ");
       }
    }
}
