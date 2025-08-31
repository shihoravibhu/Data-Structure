// 404. Sum of Left Leaves

package BinaryTree;

public class bt17_sumOfLeftLeaves {
      public int helper(TreeNode curr , boolean isLeft){

        if(curr == null){
            return 0;
        }

        if(curr.left == null && curr.right == null && isLeft == true){
            return curr.val;
        }

        return helper(curr.left , true) + helper(curr.right , false);
        
    }

    public int sumOfLeftLeaves(TreeNode root) {
        
        return helper(root,false);
    }
    public static void main(String[] args) {
        
    }
}
