package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        for(int i=0;i<nums.length && nums[i]<=0;++i){
            if(i==0 || nums[i-1]!=nums[i]){
                twoSum(nums,i,result);
            }
        }
        return result;
    }
    public void twoSum(int[] nums,int i,List<List<Integer>> result){
        HashSet<Integer>set=new HashSet<>();
        for(int j=i+1;j<nums.length;++j){
            if(set.contains(nums[j])){
                int compliment=-nums[i]-nums[j];
                result.add(Arrays.asList(nums[i],nums[j],compliment));
                while(j+1<nums.length && nums[j]==nums[j+1]){
                    ++j;
                }
                set.add(nums[j]);
            }
        }
    }
}
