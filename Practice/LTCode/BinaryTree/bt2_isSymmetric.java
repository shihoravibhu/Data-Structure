// 101. Symmetric Tree

package BinaryTree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
        this.left = left;
          this.right = right;
      }
  }


public class bt2_isSymmetric {

     public boolean isSymmetricHelp(TreeNode left , TreeNode right){

        if(left == null || right == null){   // If either node is null, return true only if both are null
            return (left == right);
        }

        if(left.val != right.val){  // If the values of the nodes are different, the tree is not symmetric
            return false;
        }

         // Recursively check the outer and inner pairs of nodes
        return isSymmetricHelp(left.left,right.right) &&
                isSymmetricHelp(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {

        // if root == null then return true because its symmentric

        return root == null || isSymmetricHelp(root.left,root.right);
        
    }
    public static void main(String[] args) {
        
    }
}
