package CodingMaster.Leetcode.Meta;

import CodingMaster.Leetcode.LinkedIn.TreeNode;

public class RangeSumBST {
    int ans;

    public int rangeSumBST(TreeNode root, int low, int high) {
        ans = 0;
        dfs(root, low, high);
        return ans;
    }
    public void dfs(TreeNode node, int L, int R) {
        if (node != null) {
            if (node.val>=L && node.val <= R)
                ans += node.val;
            if ( node.val > L)
                dfs(node.left, L, R);
            if (node.val < R)
                dfs(node.right, L, R);
        }
    }
}
