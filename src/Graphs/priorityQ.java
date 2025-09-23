package Graphs;

import java.util.PriorityQueue;

class Player {
  String name;
  int ranking;
  int age;

  public Player(String name, int ranking, int age) {
    this.name = name;
    this.ranking = ranking;
    this.age = age;
  }
}

public class priorityQ {

  public static void main(String[] args) {
    PriorityQueue<Player> pq = new PriorityQueue<>(
        (a, b) -> b.ranking - a.ranking);
    pq.add(new Player("Virat", 3, 36));
    pq.add(new Player("Rohit", 5, 38));
    pq.add(new Player("Bumrah", 1, 32));
    pq.add(new Player("Jadeja", 6, 39));
    pq.add(new Player("Hardik", 2, 35));
    pq.add(new Player("Gill", 4, 29));

    while (!pq.isEmpty()) {

      System.out.print(pq.poll().name);
    }
  }

}
