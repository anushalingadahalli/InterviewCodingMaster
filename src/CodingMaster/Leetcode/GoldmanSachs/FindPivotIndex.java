package CodingMaster.Leetcode.GoldmanSachs;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum=0,leftsum=0;
        for(int n: nums)
            sum+=n;
        for(int i =0;i < nums.length;i++){
            if(leftsum==sum-nums[i]-leftsum)return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}
