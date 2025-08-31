// 112. Path Sum

package BinaryTree;

public class bt16_hasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null){
            return false;
        }

        if(root != null && root.left == null && root.right == null){            // For Leaf Node

            return root.val == targetSum;
        }

        return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val);
        
    }
    public static void main(String[] args) {
        
    }
}
