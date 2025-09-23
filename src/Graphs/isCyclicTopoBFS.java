package Graphs;

import java.util.*;

public class isCyclicTopoBFS {

  public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
    int[] indegree = new int[V];

    // Step 1: Calculate indegree
    for (int u = 0; u < V; u++) {
      for (int v : adj.get(u)) {
        indegree[v]++;
      }
    }

    // Step 2: Push all nodes with indegree 0
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < V; i++) {
      if (indegree[i] == 0) {
        q.add(i);
      }
    }

    int count = 0; // count of nodes processed

    // Step 3: Process queue
    while (!q.isEmpty()) {
      int node = q.poll();
      count++;

      for (int nbr : adj.get(node)) {
        indegree[nbr]--;
        if (indegree[nbr] == 0) {
          q.add(nbr);
        }
      }
    }

    // Step 4: Check if all nodes are processed
    return count != V; // true = cycle present, false = no cycle
  }
}
