package LeetCode100;

public class BinaryTreeUnivalued {
    
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val =val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean univalued(TreeNode root) {

        if(root == null) return true;
        return helper(root, root.val);
    }

    private static boolean helper(TreeNode node, int val) {

        if(node == null) return true;
        if(node.val != val) return false;

        return helper(node.left, val) && helper(node.right, val);
    }
}
