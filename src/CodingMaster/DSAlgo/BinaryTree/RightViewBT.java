package CodingMaster.DSAlgo.BinaryTree;

import java.util.ArrayList;

public class RightViewBT {
    ArrayList<Integer> getrightView(Node node) {

        //add code here.
        ArrayList<Integer> list = new ArrayList<>();
        int level = 0;
        rightView(node , level , list);
        return list;
    }
    void rightView(Node root , int level , ArrayList<Integer> ans){

        if(root == null)
            return;

        if(level == ans.size()){
            ans.add(root.data);
        }
        rightView(root.right , level + 1 , ans);
        rightView(root.left , level + 1 , ans);
    }
}
