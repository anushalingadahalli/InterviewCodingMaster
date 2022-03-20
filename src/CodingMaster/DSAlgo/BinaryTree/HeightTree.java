package CodingMaster.DSAlgo.BinaryTree;



public class HeightTree {
    public int getHeight(Node root){
        if (root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}

