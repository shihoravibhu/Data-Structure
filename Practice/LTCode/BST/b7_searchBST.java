// 700. Search in a Binary Search Tree

package BST;

public class b7_searchBST {
    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null && root.val != val) {

            root = root.val > val ? root.left : root.right;

        }
        return root;

        // or (by recursion)

        // if (root == null || root.val == val)
        //     return root;
        // if (val < root.val)
        //     return searchBST(root.left, val);
        // return searchBST(root.right, val);

    }
    public static void main(String[] args) {
        
    }
}
