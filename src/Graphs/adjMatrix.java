package Graphs;

public class adjMatrix {

  public static void addEdge(int[][] adjMatrixx, int i, int j, boolean isDir) {
    adjMatrixx[i][j] = 1;
    if (isDir) {
      adjMatrixx[j][i] = 1;
    }
  }

  public static void main(String[] args) {
    int V = 8;
    int[][] adjMatrixx = new int[V + 1][V + 1];

    addEdge(adjMatrixx, 7, 0, true);
    addEdge(adjMatrixx, 6, 0, true);
    addEdge(adjMatrixx, 0, 2, true);
    addEdge(adjMatrixx, 2, 4, true);
    addEdge(adjMatrixx, 2, 1, true);
    addEdge(adjMatrixx, 2, 3, true);
    addEdge(adjMatrixx, 3, 5, true);

    // print
    for (int i = 0; i <= V; i++) {
      System.out.print(i + " ->");
      for (int j = 0; j <= V; j++) {
        if (adjMatrixx[i][j] == 1)
          System.out.print(j + ",");
      }
      System.out.println();
    }
  }

}
