package CodingMaster.DSAlgo.BinaryTree;

public class SizeBinaryTree {
    public int getSize(Node root){
        if(root==null){
            return 0;
        }
        return getSize(root.left)+getSize(root.right)+1;
    }
}
