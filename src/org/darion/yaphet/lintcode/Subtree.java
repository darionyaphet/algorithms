package org.darion.yaphet.lintcode;

public class Subtree {
    public static boolean isSubtree(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null) {
            return true;
        }

        if (T1 == null && T2 != null) {
            return false;
        }

        if (T1 != null && T2 == null) {
            return true;
        }

        if (T1.val == T2.val) {
            if (isSubtree(T1.left, T2.left) && isSubtree(T1.right, T2.right)) {
                return true;
            } else {
                return false;
            }
        } else {
            return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
        }
    }

    public static void main(String[] args) {

    }
}
