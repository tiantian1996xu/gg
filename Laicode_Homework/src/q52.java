import java.util.*;

public class q52 {

    public static List<Integer> inOrder(TreeNode root,int key) {
        // Write your solution here
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }
    private static TreeNode helper(TreeNode root, List<Integer> res){
        if(root ==null) return null;
        helper(root.left,res);
        res.add(root.key);
        if(root.key == 5){

        }

        helper(root.right,res);
        return root.right;
    }

    public static void main(String[] args){            //            10
        TreeNode node1 = new TreeNode(10);        //          5   15
        TreeNode node2 = new TreeNode(5);        //                  20
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(20);

        node1.left = node2;
        node1.right = node3;
        node3.right = node4;

        System.out.println(inOrder(node1,5));
    }
}
