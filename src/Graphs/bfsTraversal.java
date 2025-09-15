package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class bfsTraversal {

  // Input:
  // 5 4
  // 0 1
  // 0 2
  // 1 3
  // 2 4

  // Output:
  // 0 1 2 3 4

  // Build adjList
  public static ArrayList<ArrayList<Integer>> adjjList(int V, int E, Scanner sc) {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    for (int i = 0; i < V; i++)
      adjList.add(new ArrayList<>());

    for (int e = 0; e < E; e++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      adjList.get(u).add(v);
      adjList.get(v).add(u);
    }
    return adjList;
  }

  // BFS traversal
  public static List<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adjList) {
    List<Integer> result = new ArrayList<>();
    boolean[] visited = new boolean[V];
    Queue<Integer> q = new LinkedList<>();

    q.add(0);
    visited[0] = true;

    while (!q.isEmpty()) {
      int node = q.poll();
      result.add(node);

      for (int nbr : adjList.get(node)) {
        if (!visited[nbr]) {
          visited[nbr] = true;
          q.add(nbr); // ✅ enqueue first
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int V = sc.nextInt();
    int E = sc.nextInt();

    ArrayList<ArrayList<Integer>> adjList = adjjList(V, E, sc);

    List<Integer> bfsOrder = bfs(V, adjList);
    System.out.println(bfsOrder);
  }
}
