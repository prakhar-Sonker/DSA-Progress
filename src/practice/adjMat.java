package practice;

import java.util.Scanner;

public class adj {
  // public int[][] buildAdjMatrix(int V, int[][] edges) {
  // for(int i=0;i<V;i++){

  // }
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int V = sc.nextInt();
    int E = sc.nextInt();

    int[][] adjMatrixxxx = new int[V][V];

    for (int i = 0; i < E; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();

      addEdge(adjMatrixxxx, u, v, true);

    }

    printMatrix(adjMatrixxxx);

  }

  public static void addEdge(int[][] adjMatrixxxx, int i, int j, boolean dir) {
    adjMatrixxxx[i][j] = 1;
    if (dir) {
      adjMatrixxxx[j][i] = 1;
    }
  }

  public static void printMatrix(int[][] adjMatrixxxx) {
    int V = adjMatrixxxx.length;
    for (int i = 0; i < V; i++) {
      for (int j = 0; j < V; j++) {
        System.out.print(adjMatrixxxx[i][j] + " ");
      }
      System.out.println();
    }
  }
}
