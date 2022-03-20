package CodingMaster.Leetcode.LinkedIn;

import java.util.HashSet;
import java.util.Set;

public class SecondMinNode {
    public void dfs(TreeNode root, Set<Integer> uniques){
        if(root!=null){
            uniques.add(root.val);
            dfs(root.left,uniques);
            dfs(root.right,uniques);
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        int min1=root.val;
        long ans= Long.MAX_VALUE;
        Set<Integer>unique=new HashSet<>();
        dfs(root,unique);
        for(int n : unique){
            if(min1<n && n <ans)
                ans=n;
        }
        return ans<Long.MAX_VALUE ? (int)ans :-1;

    }
}
