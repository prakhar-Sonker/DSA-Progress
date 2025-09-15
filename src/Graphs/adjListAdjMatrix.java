package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class adjListAdjMatrix {

  public static void addEdge(int[][] adjMatrix, int i, int j, boolean isBidir) {
    adjMatrix[i][j] = 1;
    if (isBidir) {
      adjMatrix[j][i] = 1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int V = sc.nextInt();
    int E = sc.nextInt();

    // adjMatrix
    int[][] adjMatrix = new int[V][V];

    // adjList
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    // added empty list
    for (int i = 0; i < V; i++) {
      adjList.add(new ArrayList<>());
    }

    // addEdge(adjMatrix, 0, 1, true);
    // addEdge(adjMatrix, 0, 2, true);
    // addEdge(adjMatrix, 1, 2, true);

    // logic
    for (int e = 0; e < E; e++) {
      int u = sc.nextInt();
      int v = sc.nextInt();

      adjList.get(u).add(v);
      adjList.get(v).add(u);

      addEdge(adjMatrix, u, v, true);
    }

    // print logic
    for (int i = 0; i < V; i++) {
      System.out.print(i + " [ ");
      for (int j = 0; j < V; j++) {
        System.out.print(adjMatrix[i][j] + " ");
      }
      System.out.print("] ");
      System.out.println();
    }

    System.out.println();

    // print logic
    for (int i = 0; i < V; i++) {
      System.out.print(i + " -> ");
      for (int nbrs : adjList.get(i)) {
        System.out.print(nbrs + " ");
      }
      System.out.println();
    }

  }

}
