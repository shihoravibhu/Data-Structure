// 104. Maximum Depth of Binary Tree

package BinaryTree;

public class bt3_maxDepth {
     public int maxDepth(TreeNode root) {

        //maxDepth = height
        
        if(root == null){
            return 0;
        }
        
       int left =  maxDepth(root.left);
       int right = maxDepth(root.right);

        return Math.max(left,right) + 1;
    }
    public static void main(String[] args) {
        
    }
}
