package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
            set.add(num);
        int expectedNum=nums.length+1;
        for(int i=0;i<expectedNum;i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
        }
}

