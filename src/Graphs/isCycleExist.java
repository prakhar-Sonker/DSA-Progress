package Graphs;

import java.util.ArrayList;

public class isCycleExist {

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, -1, vis, adj))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {

        vis[node] = true;

        for (int nbrs : adj.get(node)) {
            if (!vis[nbrs]) {
                if (dfs(nbrs, node, vis, adj))
                    return true;
            } else if (nbrs != parent)
                return true;
        }
        return false;
    }
}
