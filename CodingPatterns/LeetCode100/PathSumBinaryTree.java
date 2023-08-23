package LeetCode100;

public class PathSumBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean hasPathSum(TreeNode root, int sum) {

        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == sum) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val); 

    }
    
}
