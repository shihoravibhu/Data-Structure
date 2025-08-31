// 111. Minimum Depth of Binary Tree

package BinaryTree;

public class bt14_minDepth {
     public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        // If no left child, recurse only right
       if(root.left == null) return minDepth(root.right) + 1;

        //If no right child, recurse only left
       if(root.right == null) return minDepth(root.left) + 1;        

        // Both children exist, take the minimum
        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
        
    }
    public static void main(String[] args) {
        
    }
}
