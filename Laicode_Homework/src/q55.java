import java.util.*;

public class q55 {
    public static List<Integer> getRange(TreeNode root, int min, int max) {
        // Write your solution
        List<Integer> list = new ArrayList<Integer>();
        getRange(root, min, max, list);
        return list;
    }

    private static void getRange(TreeNode root, int min, int max, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.key > min){
            System.out.println(root.key+" bigger than min");
            getRange(root.left, min, max, list);
        }
        if(root.key >= min && root.key <= max){
            System.out.println(" add "+root.key);
            list.add(root.key);
        }
        if(root.key < max){
            System.out.println(root.key+" less than max");
            getRange(root.right, min, max, list);
        }
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
