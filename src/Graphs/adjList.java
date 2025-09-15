package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class adjList {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int V = sc.nextInt();
    int E = sc.nextInt();

    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    for (int i = 0; i < V; i++) {
      adjList.add(new ArrayList<>());
    }

    for (int i = 0; i < E; i++) {

      int u = sc.nextInt();
      int v = sc.nextInt();

      adjList.get(u).add(v);
      adjList.get(v).add(u);
    }

    // printing
    for (int i = 0; i < V; i++) {
      System.out.print(i + " -> ");
      for (int nbrs : adjList.get(i)) {
        System.out.print(nbrs + " ");
      }
      System.out.println();
    }
  }

}
