package LeetCode100;

public class SumOfLeftLeaves {

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
    
    public static int sumOfLeftLeaves(TreeNode root) {

        if(root == null) return 0;

        int sum = 0;

        if(root.left != null) {
            
            if(root.left.left == null && root.left.right == null) {
                sum = sum + root.left.val;
            }
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}
