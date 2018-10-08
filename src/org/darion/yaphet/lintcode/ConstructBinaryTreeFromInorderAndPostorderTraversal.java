package org.darion.yaphet.lintcode;

/**
 * http://blog.csdn.net/wutingyehe/article/details/51182488
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null ||
                inorder.length == 0 || postorder.length == 0) {
            return null;
        }

        return buildTree(inorder, 0, inorder.length - 1,
                postorder, 0, postorder.length - 1);
    }

    private int position(int[] nums, int key) {
        int i = 0;
        while (nums[i++] != key) ;
        return --i;
    }

    public TreeNode buildTree(int[] inorder, int leftInorder, int rightInorder,
                              int[] postorder, int leftPostorder, int rightPostorder) {
        if (leftInorder > rightInorder || leftPostorder > rightPostorder) {
            return null;
        }

        System.out.println("Index : " + rightPostorder + " " + postorder[rightPostorder]);
        TreeNode root = new TreeNode(postorder[rightPostorder]);
        int position = position(inorder, postorder[rightPostorder]);
        System.out.println("Position " + position);
        root.left = buildTree(inorder, leftInorder, position - 1,
                postorder, leftPostorder, leftPostorder + position - leftInorder - 1);

        root.right = buildTree(inorder, position + 1, rightInorder,
                postorder, leftPostorder + position - leftInorder, rightPostorder - 1);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {1, 2, 3};
        int[] postorder = {1, 3, 2};
        ConstructBinaryTreeFromInorderAndPostorderTraversal instance = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        TreeNode root = instance.buildTree(inorder, postorder);
    }
}