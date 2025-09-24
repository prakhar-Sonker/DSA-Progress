package practice;

import java.util.ArrayList;
import java.util.List;

public class adjList {

   public List<List<Integer>> buildAdjList(int V, int[][] edges) {

      List<List<Integer>> adj = new ArrayList<>();
      // adding empty arrayList
      for (int i = 0; i < V; i++) {
         adj.add(new ArrayList<>());
      }
      for (int[] edge : edges) {
         int u = edge[0];
         int v = edge[1];

         adj.get(u).add(v);
         adj.get(v).add(u);
      }
      return adj;
   }

   // print adjacency list
   public void printAdjList(List<List<Integer>> adj) {
      for (int i = 0; i < adj.size(); i++) {
         System.out.print(i + " -> ");
         for (int v : adj.get(i)) {
            System.out.print(v + " ");
         }
      }
      System.out.println();
   }

   public static void main(String[] args) {
      Solution sol = new Solution();

      int V = 4;
      int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 3 } };

      List<List<Integer>> adj = sol.buildAdjList(V, edges);

      sol.printAdjList(adj);
   }
}
