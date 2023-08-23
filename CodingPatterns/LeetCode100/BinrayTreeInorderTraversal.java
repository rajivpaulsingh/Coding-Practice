package LeetCode100;

import java.util.ArrayList;
import java.util.List;

public class BinrayTreeInorderTraversal {

    class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    
    private static void helper(TreeNode node, List<Integer> res) {

        if(node == null) {
            return;
        }
        helper(node.left, res);
        res.add(node.val);
        helper(node.right, res);
    }
}
