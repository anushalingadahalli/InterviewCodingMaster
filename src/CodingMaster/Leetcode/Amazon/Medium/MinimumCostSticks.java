package CodingMaster.Leetcode.Amazon.Medium;

import java.util.PriorityQueue;

public class MinimumCostSticks {
    public int connectSticks(int[] sticks) {
        int totalcost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (int n : sticks) {
            pq.offer(n);
        }
        while (pq.size() > 1) {
            int stick1 = pq.remove();
            int stick2 = pq.remove();

            int cost = stick1 + stick2;
            totalcost += cost;
            pq.add(cost);
        }
        return totalcost;
    }
}