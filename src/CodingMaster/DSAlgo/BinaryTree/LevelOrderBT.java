package CodingMaster.DSAlgo.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBT {
    public void levelOrder(Node root){
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
           Node cur= qu.poll();
            System.out.println(cur.data);
            if(cur.left!=null){
                qu.add(cur.left);
            }
            if(cur.right!=null){
                qu.add(cur.right);
            }
        }
    }
}
