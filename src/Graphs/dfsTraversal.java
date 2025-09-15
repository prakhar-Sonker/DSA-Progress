package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dfsTraversal {

  public static List<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    ArrayList<Integer> result = new ArrayList<>();
    boolean[] vis = new boolean[V];
    dfsHelper(0, adj, vis, result);
    return result;
  }

  public static void dfsHelper(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> result) {
    vis[src] = true;
    result.add(src);

    for (int nbrs : adj.get(src)) {
      if (!vis[nbrs]) {
        dfsHelper(nbrs, adj, vis, result);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int V = sc.nextInt(); // number of vertices
    int E = sc.nextInt(); // number of edges

    // adjacency list
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < V; i++) {
      adj.add(new ArrayList<>());
    }

    for (int i = 0; i < E; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      adj.get(u).add(v);
      adj.get(v).add(u); // undirected
    }

    // DFS traversal
    List<Integer> dfsOrder = dfsOfGraph(V, adj);
    for (int node : dfsOrder) {
      System.out.print(node + " ");
    }
  }
}
