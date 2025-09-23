package Graphs;

import java.util.*;

class topoSortBFS {

    public int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];

        // Step 1: Calculate indegree of each vertex
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                indegree[v]++;
            }
        }

        // Step 2: Put all vertices with indegree 0 in queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 3: Process the queue
        int[] topo = new int[V];
        int idx = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            topo[idx++] = node;

            // Reduce indegree of neighbors
            for (int nbr : adj.get(node)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) {
                    q.add(nbr);
                }
            }
        }

        return topo;
    }
}
