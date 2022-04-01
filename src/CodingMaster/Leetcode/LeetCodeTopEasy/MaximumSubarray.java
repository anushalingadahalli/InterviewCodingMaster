package CodingMaster.Leetcode.LeetCodeTopEasy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int current_subarray=nums[0];
        int max_subarray=nums[0];

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            current_subarray=Math.max(num,current_subarray+num);
            max_subarray=Math.max(max_subarray,current_subarray);
        }
        return  max_subarray;
    }
}
