// 103. Binary Tree Zigzag Level Order Traversal

package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bt22_zigzagLevelOrder {
      public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Final result list
        List<List<Integer>> result = new ArrayList<>();

        // Edge case: if tree is empty
        if (root == null) return result;

        // Queue for BFS traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Flag to control direction of traversal
        boolean leftToRight = true;

        // Perform level order traversal
        while (!queue.isEmpty()) {
            int size = queue.size(); // number of nodes in current level
            List<Integer> level = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                // Get current node
                TreeNode node = queue.poll();

                // Insert node value depending on traversal direction
                if (leftToRight) {
                    level.add(node.val); // normal order
                } else {
                    level.add(0, node.val); // insert at front for reverse order
                }

                // Add children to queue for next level
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            // Add this level to result
            result.add(level);

            // Flip the direction for next level
            leftToRight = !leftToRight;
        }

        return result;
    }
    public static void main(String[] args) {
        
    }
}
