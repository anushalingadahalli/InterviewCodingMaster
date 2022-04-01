package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.HashSet;

public class DistinctIntersectArrayII {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        for(int s1:nums1)
            set1.add(s1);
        HashSet<Integer>set2=new HashSet<>();
        for(int s2:nums2)
            set2.add(s2);
        set1.retainAll(set2);
        int[] output=new int[set1.size()];
        int index=0;
        for(int res:set1)
        {
            output[index++]=res;
        }
        return output;
    }
}
