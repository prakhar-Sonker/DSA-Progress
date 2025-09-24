package Greedy;

import java.util.PriorityQueue;

public class minCostOfRopes {

    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int totalCost = 0;
        while (pq.size() > 1) {
            int r1 = pq.poll();
            int r2 = pq.poll();
            totalCost += r1 + r2;
            pq.add(r1 + r2);
        }
        return totalCost;
    }

}
