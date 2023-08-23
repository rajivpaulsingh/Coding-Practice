package LeetCode100;

public class MaxDepthBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode rigNode) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int maxDepth(TreeNode root) {

        if(root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    
}
