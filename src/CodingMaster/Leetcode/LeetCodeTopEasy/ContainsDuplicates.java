package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.HashSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            if(! set.add(n));
            {
            return true;
            }
        }
        return false;
    }
}
