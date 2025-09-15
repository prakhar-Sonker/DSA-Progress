package Graphs;

import java.util.*;

public class practiceadjMatrix {

  public static void addEdge(int[][] adjMatrix, int i, int j, boolean bidir) {
    adjMatrix[i][j] = 1;
    if (bidir) {
      adjMatrix[j][i] = 1;
    }
  }

  public static void printMatrix(int[][] adjMatrix) {
    int V = adjMatrix.length;
    for (int i = 0; i < V; i++) {
      for (int j = 0; j < V; j++) {
        System.out.print(adjMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int V = sc.nextInt(); // number of vertices
    int E = sc.nextInt(); // number of edges

    int[][] adjMatrix = new int[V][V];

    // input edges
    for (int e = 0; e < E; e++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      addEdge(adjMatrix, u, v, true); // true for undirected, false for directed
    }

    // print adjacency matrix
    printMatrix(adjMatrix);
  }
}
