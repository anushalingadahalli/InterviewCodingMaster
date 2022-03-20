package CodingMaster.DSAlgo.BinaryTree;

import java.util.ArrayList;

public class LeftViewBT {
    public ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        leftView(root, result, 0);
        return result;
    }

    void leftView(Node root, ArrayList<Integer> view, int i) {

        if (root == null) {
            return;
        }

        if (view.size() == i) {
            view.add(root.data);
        }

        leftView(root.left, view, i+1);
        leftView(root.right, view, i+1);
    }
}
