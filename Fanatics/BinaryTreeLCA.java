package Fanatics;

public class BinaryTreeLCA {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || p == null || q == null) {
            return root;
        }

        if(p.val < root.val && q.val < root.val) {
            return lca(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lca(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.right;

        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + lca(root, p, q).val);
    }
}
