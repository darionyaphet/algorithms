package org.darion.data.structure.tree;

/**
 * A simple interface for binary trees.
 *
 * An empty binary tree is represented with the value null;
 *
 * a non-empty tree by its root node.
 */
public interface BinaryTreeNode<T> {

    /**
     * Returns the data stored in this node.
     */
    T getData();

    /**
     * Modifies the data stored in this node.
     */
    void setData(T data);

    /**
     * Returns the parent of this node, or null if this node is a root.
     */
    BinaryTreeNode<T> getParent();

    /**
     * Returns the left child of this node, or null if it does
     * not have one.
     */
    BinaryTreeNode<T> getLeft();

    /**
     * Removes child from its current parent and inserts it as the
     * left child of this node.  If this node already has a left
     * child it is removed.
     *
     * @throws IllegalArgumentException if the child is
     *                                  an ancestor of this node, since that would make
     *                                  a cycle in the tree.
     */
    void setLeft(BinaryTreeNode<T> child);

    /**
     * Returns the right child of this node, or null if it does
     * not have one.
     */
    BinaryTreeNode<T> getRight();

    /**
     * Removes child from its current parent and inserts it as the
     * right child of this node.  If this node already has a right
     * child it is removed.
     *
     * @throws IllegalArgumentException if the child is
     *                                  an ancestor of this node, since that would make
     *                                  a cycle in the tree.
     */
    void setRight(BinaryTreeNode<T> child);

    /**
     * Removes this node, and all its descendants, from whatever
     * tree it is in.  Does nothing if this node is a root.
     */
    void removeFromParent();

    /**
     * Visits the nodes in this tree in preorder.
     */
    void traversePreorder(Visitor visitor);

    /**
     * Visits the nodes in this tree in postorder.
     */
    void traversePostorder(Visitor visitor);

    /**
     * Visits the nodes in this tree in inorder.
     */
    void traverseInorder(Visitor visitor);

    /**
     * Simple visitor interface.
     */
    public interface Visitor {
        <E> void visit(BinaryTreeNode<E> node);
    }
}