package Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class countComponent {

  public static int countComponents(int V, ArrayList<ArrayList<Integer>> adj) {

    ArrayList<Integer> result = new ArrayList<>();
    boolean[] vis = new boolean[V];
    int count = 0;
    for (int i = 0; i < V; i++) {
      if (!vis[i]) {
        bfs(i, adj, result, vis, count);
        count++;
      }
    }
    return count;
  }

  public static int bfs(int src, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result, boolean[] vis,
      int count) {

    Queue<Integer> q = new ArrayDeque<>();
    q.add(src);
    vis[src] = true;
    while (!q.isEmpty()) {
      int node = q.poll();
      result.add(node);
      for (int nbrs : adj.get(node)) {
        if (!vis[nbrs]) {
          vis[nbrs] = true;
          q.add(nbrs);
        }
      }
    }
    count++;
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int V = sc.nextInt(); // number of vertices
    int E = sc.nextInt(); // number of edges

    // adjacency list
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<>());

    for (int i = 0; i < E; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      adj.get(u).add(v);
      adj.get(v).add(u); // undirected
    }

    int numComponents = countComponents(V, adj);
    System.out.println("Number of connected components: " + numComponents);
  }

}
