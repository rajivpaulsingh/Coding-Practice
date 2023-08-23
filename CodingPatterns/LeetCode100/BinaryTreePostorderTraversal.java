package LeetCode100;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        //Create a binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);

        System.out.println("Postorder traversal: " + postorderTraversal(root));
    }
    
    private static List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private static void helper(TreeNode node, List<Integer> res) {

        if(node == null) {
            return;
        }

        helper(node.left, res);
        helper(node.right, res);
        res.add(node.val);
    }
}
