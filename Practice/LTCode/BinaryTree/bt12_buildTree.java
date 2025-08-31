// 106. Construct Binary Tree from Inorder and Postorder Traversal

package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class bt12_buildTree {
    
     private int postorderIdx;
    private Map<Integer,Integer> mp;

    public TreeNode build(int[] postorder ,int start ,int end){

        // Base case: no elements to construct the tree
        if(start > end){
            return null;
        }
        
        // Get the current root from postorder and move pointer left
        int rootval = postorder[postorderIdx--];
        TreeNode root = new TreeNode(rootval);

        int mid = mp.get(rootval);
        
        // IMPORTANT: build right subtree before left subtree
        root.right = build(postorder,mid+1,end);
        root.left = build(postorder,start,mid-1);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        mp = new HashMap<>();

        // Build value-to-index map for inorder array
        for(int i=0 ; i<inorder.length ; i++){
            mp.put(inorder[i],i);
        }
        
        // Start from the last index of postorder (root)
        postorderIdx = postorder.length-1;

        return build(postorder , 0 , postorder.length-1);
    }
    public static void main(String[] args) {
        
    }
}
