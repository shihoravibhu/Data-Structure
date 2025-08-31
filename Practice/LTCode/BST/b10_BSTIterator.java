// 173. Binary Search Tree Iterator

package BST;

import java.util.Stack;

public class b10_BSTIterator {
    class BSTIterator {
        private Stack<TreeNode> s;

        public void storeLeftNode(TreeNode root) { // push all left children of a node

            while (root != null) {
                s.push(root);
                root = root.left;
            }
        }

        public BSTIterator(TreeNode root) {
            s = new Stack<>();
            storeLeftNode(root);
        }

        public int next() {
            TreeNode ans = s.pop();

            storeLeftNode(ans.right); // If the popped node has a right child, push all its left descendants

            return ans.val;
        }

        public boolean hasNext() {
            return !s.isEmpty();
        }
    }

    // or

    // class BSTIterator {

    // List<Integer> list = new ArrayList<>();
    // int currIdx = 0;

    // public BSTIterator(TreeNode root) {
    // inOrder(root);
    // }

    // public int next() {
    // return list.get(currIdx++);
    // }

    // public boolean hasNext() {
    // return currIdx < list.size();
    // }

    // private void inOrder(TreeNode root) {
    // if(root == null) {
    // return;
    // }
    // inOrder(root.left);
    // list.add(root.val);
    // inOrder(root.right);
    // }
    // }
    public static void main(String[] args) {

    }
}
