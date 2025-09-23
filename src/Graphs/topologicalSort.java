package Graphs;

import java.util.Stack;

public class topologicalSort {

  public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
    // your code
    boolean[] vis = new boolean[V];
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < V; i++) {
      if (!vis[i]) {
        dfs(i, adj, vis, st);
      }
    }

    int idx = 0;
    int[] arr = new int[V];
    while (!st.isEmpty()) {
      arr[idx++] = st.pop();
    }
    return arr;

  }

  public static void dfs(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> st) {
    vis[src] = true;
    for (int nbrs : adj.get(src)) {
      if (!vis[nbrs]) {
        dfs(nbrs, adj, vis, st);
      }
    }
    st.push(src);
  }
}
