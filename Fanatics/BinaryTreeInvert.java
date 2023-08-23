package Fanatics;

public class BinaryTreeInvert {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode invertBinaryTree(TreeNode root) {

        if(root == null) return null;
        
        invert(root);
        return root;
    }

    private static void invert(TreeNode root) {      

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);
    }
    
}
