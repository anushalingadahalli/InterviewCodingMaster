package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DisappearedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         HashSet<Integer>set=new HashSet<>();
         for(int num:nums)
             set.add(num);
         List<Integer>missingNum=new ArrayList<>();
         for(int i=1;i<= nums.length;i++){
             if(!set.contains(i))
             {
                 missingNum.add(i);
             }
         }
         return missingNum;
    }
}
