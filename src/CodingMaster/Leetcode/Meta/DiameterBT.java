package CodingMaster.Leetcode.Meta;

import CodingMaster.Leetcode.LinkedIn.TreeNode;

public class DiameterBT {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        longestPath(root);
        return diameter;
    }
    public int longestPath(TreeNode root){
        if(root==null)
            return 0;
        int left=longestPath(root.left);
        int right=longestPath(root.right);
        diameter=Math.max(diameter,(left+right));
        return Math.max(left,right)+1;
    }
}
