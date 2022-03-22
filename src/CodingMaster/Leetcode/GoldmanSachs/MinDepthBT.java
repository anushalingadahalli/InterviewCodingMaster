package CodingMaster.Leetcode.GoldmanSachs;

import CodingMaster.Leetcode.LinkedIn.TreeNode;

public class MinDepthBT {
    public int minDepth(TreeNode root) {
       if(root==null){
           return 0;
       }
       if(root.left==null && root.right==null){
           return 1;
       }
       int minDepth=Integer.MAX_VALUE;
       if(root.left!=null){
           minDepth=Math.min(minDepth,minDepth(root.left));
       }
       if(root.right!=null){
           minDepth=Math.min(minDepth,minDepth(root.right));
       }

       return minDepth+1;
    }
}
