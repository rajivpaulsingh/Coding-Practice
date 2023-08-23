package Fanatics;

public class BinaryTreeDiameter {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private static int diameter = 0;
    private static int diameterBT(TreeNode root) {

        if(root == null) return 0;
        helperDFS(root);
        return diameter;
    }

    private static int helperDFS(TreeNode node) {

        if(node == null) return 0;

        int left = helperDFS(node.left);
        int right = helperDFS(node.right);

        int currentDiameter = left + right;
        diameter = Math.max(diameter, currentDiameter);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the binary tree: " + diameterBT(root));
    }
}
