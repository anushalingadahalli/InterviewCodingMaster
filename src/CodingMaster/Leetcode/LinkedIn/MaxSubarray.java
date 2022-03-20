package CodingMaster.Leetcode.LinkedIn;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int currentsub=nums[0];
        int maxsub=nums[0];
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
            currentsub=Math.max(n,currentsub+n);
            maxsub=Math.max(maxsub,currentsub);
        }
        return maxsub;
    }
}
