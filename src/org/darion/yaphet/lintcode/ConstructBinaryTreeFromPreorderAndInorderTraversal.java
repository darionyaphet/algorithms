package org.darion.yaphet.lintcode;

/**
 * http://blog.csdn.net/wutingyehe/article/details/51176103
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    private int position(int[] nums, int key) {
        int i = 0;
        while (nums[i++] != key) ;
        return --i;
    }

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        if (inOrder == null || preOrder == null ||
                inOrder.length == 0 || preOrder.length == 0) {
            return null;
        }

        return createTree(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    public TreeNode createTree(int[] preorder, int leftPreorder, int rightPreorder, int[] inorder, int leftInorder, int rightInorder) {
        if (leftPreorder > rightPreorder || leftInorder > rightInorder) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[leftPreorder]);
        int position = position(inorder, preorder[leftPreorder]);
        System.out.println("Position " + position);
        root.left = createTree(preorder, leftPreorder + 1, leftPreorder + position - leftInorder,
                inorder, leftInorder, position - 1);
        root.right = createTree(preorder, leftPreorder + position - leftInorder + 1, rightPreorder,
                inorder, position + 1, rightInorder);
        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = {1, 2, 3};
        int[] inOrder = {2, 1, 3};
        ConstructBinaryTreeFromPreorderAndInorderTraversal instance = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        System.out.println(instance.buildTree(preOrder, inOrder));
    }
}
