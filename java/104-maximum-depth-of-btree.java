class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(descent(root.left, 1), descent(root.right, 1));
    }

    public int descent(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        return Math.max(descent(node.left, depth + 1), descent(node.right, depth + 1));
    }
}