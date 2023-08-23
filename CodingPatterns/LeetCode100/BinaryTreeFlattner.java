package LeetCode100;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = null;
        this.right = null;
    };
}

public class BinaryTreeFlattner {
    
    public static void main(String[] args) {
        
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        flatten(root);

        // Print the flattened
        TreeNode cur = root;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.right;
        }
    }

    public static void flatten(TreeNode root) {

        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();

            if(cur.right != null) {
                stack.push(cur.right);
            }
            if(cur.left != null) {
                stack.push(cur.left);
            }

            cur.left = null;

            if(!stack.isEmpty()) {
                cur.right = stack.peek();
            }
        }
    }
}
