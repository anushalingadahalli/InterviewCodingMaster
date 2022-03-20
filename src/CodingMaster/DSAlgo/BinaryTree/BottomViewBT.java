package CodingMaster.DSAlgo.BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BottomViewBT {
    //Function to return a list of nodes visible from the top view
    //from left to right in Binary Tree.
    public static ArrayList<Integer> bottomView(Node root)
    {
        // add your code
        Queue<QueueObject> qu=new LinkedList<>();
        Map<Integer,Node> map=new TreeMap<>();
        ArrayList<Integer>output=new ArrayList<>();
        if (root == null) {
            return new ArrayList<>(0);
        }
        else {
            qu.add(new QueueObject(root, 0));
        }
        while(!qu.isEmpty()){
            QueueObject obj=qu.poll();
            if(!map.containsKey(obj.hd)){
                map.put(obj.hd,obj.tempNode);
            }
            if(obj.tempNode.left!=null){
                qu.offer(new QueueObject(obj.tempNode.left,obj.hd-1));
            }
            if(obj.tempNode.right!=null){
                qu.offer(new QueueObject(obj.tempNode.right,obj.hd+1));
            }
        }
        for(Map.Entry<Integer,Node> entry: map.entrySet()){
            output.add(entry.getValue().data);
        }
        return output;
    }
}
//Initial Template for JAVA



class Tree {

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");

        printInorder(root.right);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t > 0){
            String s = br.readLine();
            Node root = buildTree(s);

            BottomViewBT ob = new BottomViewBT();

            ArrayList<Integer> vec = ob.bottomView(root);
            for(int x : vec)
                System.out.print(x + " ");
            System.out.println();

            t--;
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class QueueObject{
    Node tempNode;
    int hd;
    QueueObject(Node tempNode, int hd){
        this.tempNode=tempNode;
        this.hd=hd;
    }
}

class Solution
{

}