package LeetCode100;

public class SearchInBinaryTree {

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
    
    public static TreeNode searchBST(TreeNode root, int val) {

        if(root == null) return null;

        if(root.val == val) {
            return root;
        } else if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
