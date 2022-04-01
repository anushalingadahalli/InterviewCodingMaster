package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int delta=target-nums[i];
            if(map.containsKey(delta))
            {
                return new int[]{map.get(delta),i};
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
