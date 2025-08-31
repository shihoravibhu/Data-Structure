// 889. Construct Binary Tree from Preorder and Postorder Traversal

package BinaryTree;

public class bt10_constructFromPrePost {
      int preIdx = 0 , postIdx = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

        TreeNode root = new TreeNode(preorder[preIdx++]);

        if(root.val != postorder[postIdx]){
            root.left = constructFromPrePost(preorder,postorder);
        }

        if(root.val != postorder[postIdx]){
            root.right = constructFromPrePost(preorder,postorder);
        }

        postIdx++;

        return root;
        
    }
    public static void main(String[] args) {
        
    }
}
