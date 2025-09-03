/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }
    
    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    private Node head = null;
    private Node prev = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }

        rnlHelper(root);

        // After traversal, link the head and tail to make it circular.
        head.left = prev;
        prev.right = head;

        return head;
    }

    private void rnlHelper(Node node) {
        if (node == null) {
            return;
        }

        // 1. Traverse the right subtree first (reverse in-order).
        rnlHelper(node.right);

        // 2. Process the current node.
        if (prev == null) {
            head = node;
        } else {
            // Link prev (the larger value) to the current node.
            prev.left = node;
            // Link the current node to prev.
            node.right = prev;
        }

        // Update prev to the current node for the next iteration.
        prev = node;

        // 3. Traverse the left subtree last.
        rnlHelper(node.left);
    }
}