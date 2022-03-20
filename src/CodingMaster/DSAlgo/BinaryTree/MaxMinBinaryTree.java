package CodingMaster.DSAlgo.BinaryTree;

public class MaxMinBinaryTree {
    public int maxNode(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maxNode(root.left),maxNode(root.right)));
    }
}
