/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxSum;

    private int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        int neeche_hi_milgaye_answer = left + right + root.val;//1
        int koi_ek_acha = Math.max(left, right) + root.val;//2
        int only_root_acha = root.val;//3

        maxSum = Math.max(maxSum, Math.max(neeche_hi_milgaye_answer, Math.max(koi_ek_acha, only_root_acha)));

        return Math.max(koi_ek_acha, only_root_acha);
    }

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;

        solve(root);

        return maxSum;
    }
}