// 199. Binary Tree Right Side View

package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class bt19_rightSideView {
     public static void travel(int level, TreeNode root, List<Integer> arr) {
        if (root == null)
            return;

        if (level == arr.size()) {
            arr.add(root.val);
        }

        travel(level + 1, root.right, arr);
        travel(level + 1, root.left, arr);

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        travel(0, root, arr);
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
