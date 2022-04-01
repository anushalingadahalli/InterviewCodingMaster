package CodingMaster.Leetcode.LeetCodeTopEasy;

public class MinimumDeletionCost {
    public int minCost(String s, int[] cost) {
        int sum=0,max=0,res=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)!=s.charAt(i-1)){
                res+=sum-max;
                sum=0;
                max=0;
            }
            sum+=cost[i];
            max=Math.max(max,cost[i]);
        }
        res+=sum-max;
        return res;
    }
}
