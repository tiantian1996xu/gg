/*
public class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key){
        this.key = key;
    }
}
 */

import java.util.ArrayList;
import java.util.List;

public class getKeyinBSTinGivenRange {
    public static List<Integer> getRange(TreeNode root, int min, int max) {

        List<Integer> list = new ArrayList<Integer>();
        inOrder(root, min, max, list);
        return list;
    }
    private static void inOrder(TreeNode root, int min, int max, List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, min, max, list);
        if(min<=root.key && root.key<=max){
            list.add(root.key);
        }
        inOrder(root.right, min, max, list);

    }

    public static void main(String[] args){            //            10
        TreeNode node1 = new TreeNode(10);        //          5   15
        TreeNode node2 = new TreeNode(5);        //                  20
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(20);

        node1.left = node2;
        node1.right = node3;
        node3.right = node4;

        System.out.println(getRange(node1, 6,16));
    }
}


//sp: O(height)
//tm:O(n)???????
