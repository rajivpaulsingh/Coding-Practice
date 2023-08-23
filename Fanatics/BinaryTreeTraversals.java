package Fanatics;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversals {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    // Pre-order
    private static List<Integer> preOrder(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        preOrderHelper(root, res);
        return res;
    }
    private static void preOrderHelper(TreeNode node, List<Integer> res) {
        
        if(node == null) return;

        res.add(node.val);
        preOrderHelper(node.left, res);
        preOrderHelper(node.right, res);
    }

    // Post-order
    private static List<Integer> postOrder(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        postOrderHelper(root, res);
        return res;
    }
    private static void postOrderHelper(TreeNode node, List<Integer> res) {

        if(node == null) return;

        postOrderHelper(node.left, res);
        postOrderHelper(node.right, res);
        res.add(node.val);
    }

    // In-order
    private static List<Integer> inOrder(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        inOrderHelper(root, res);
        return res;
    }
    private static void inOrderHelper(TreeNode node, List<Integer> res) {

        if(node == null) return;

        inOrderHelper(node.left, res);
        res.add(node.val);
        inOrderHelper(node.right, res);
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println("Pre order traversal: " + preOrder(root));
        System.out.println("Post order traversal: " + postOrder(root));
        System.out.println("In order traversal: " + inOrder(root));
    }
}
