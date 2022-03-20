package CodingMaster.Leetcode.Amazon.Medium;

import CodingMaster.DSAlgo.BinaryTree.Node;

public class LeastCommonAncestor {

        public Node lowestCommonAncestor(Node root, Node p, Node q) {
        /* 1) if cur=p || cur=q return cur;
           2) if cur== null return null
           3) if p is on left and q is on right return root
           4) if both p and q  are on right return left or vice versa
           5) if both p and q not found return null
           */
            if(root==null) {
                return null;
            }
            if(p==root || q==root){
                return root;
            }
            Node left=lowestCommonAncestor(root.left,p,q);
            Node right=lowestCommonAncestor(root.right,p,q);
            if(left==null)return right;
            if(right == null) return left;
            return root;

    }
}
