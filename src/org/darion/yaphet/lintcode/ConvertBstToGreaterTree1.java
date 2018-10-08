package org.darion.yaphet.lintcode;

public class ConvertBstToGreaterTree1 {
    public TreeNode convertBST(TreeNode root) {
        bfs(root);
        return root;
    }

    private int sum = 0;

    void bfs(TreeNode curt) {
        if (curt == null) {
            return;
        }
        bfs(curt.right);
        sum += curt.val;
        curt.val = sum;
        bfs(curt.left);
    }
}
