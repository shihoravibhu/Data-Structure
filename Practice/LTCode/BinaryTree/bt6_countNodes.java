// 222. Count Complete Tree Nodes

package BinaryTree;

public class bt6_countNodes {
     public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;
        
    }
    public static void main(String[] args) {
        
    }
}
