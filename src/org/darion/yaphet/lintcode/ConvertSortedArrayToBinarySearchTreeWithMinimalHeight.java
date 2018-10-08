package org.darion.yaphet.lintcode;

public class ConvertSortedArrayToBinarySearchTreeWithMinimalHeight {

    public TreeNode sortedArrayToBST(int[] A) {
        if (A == null | A.length == 0) {
            return null;
        }

        return sortedArrayToBST(A, 0, A.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] A, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        System.out.println("middle " + middle);
        TreeNode root = new TreeNode(A[middle]);
        root.left = sortedArrayToBST(A, start, middle - 1);
        root.right = sortedArrayToBST(A, middle + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        ConvertSortedArrayToBinarySearchTreeWithMinimalHeight instance = new ConvertSortedArrayToBinarySearchTreeWithMinimalHeight();
        TreeNode root = instance.sortedArrayToBST(array);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);

        System.out.println(root.left.left.val);
        System.out.println(root.left.right.val);
        System.out.println(root.right.left.val);
        System.out.println(root.right.right.val);

    }
}
