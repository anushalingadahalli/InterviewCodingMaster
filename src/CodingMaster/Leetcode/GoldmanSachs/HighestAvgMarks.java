package CodingMaster.Leetcode.GoldmanSachs;

import java.util.HashMap;

public class HighestAvgMarks {

    class Pair {
        int sum, count;

        Pair(int _sum, int _count) {
            sum = _sum;
            count = _count;
        }
    }

    public int highestScore(String[][] A) {
        HashMap<String, Pair> hmap = new HashMap();
        for (String[] a : A) {
            if (hmap.containsKey(a[0])) {
                Pair p = hmap.get(a[0]);
                p.sum += Integer.valueOf(a[1]);
                p.count += 1;
                hmap.put(a[0], p);
            } else {
                Pair p = new Pair(Integer.valueOf(a[1]), 1);
                hmap.put(a[0], p);
            }
        }
        int max = 0;
        for (Pair p : hmap.values()) {
            int av = (int) p.sum / p.count;
            max = Math.max(max, av);
        }
        return max;
    }
}


