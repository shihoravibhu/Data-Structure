// 105. Construct Binary Tree from Preorder and Inorder Traversal

package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class bt11_buildTree {

      private int preorderIdx;
    private Map<Integer,Integer> mp;

    public TreeNode build(int[] preorder ,int start ,int end){

        if(start > end){
            return null;
        }

        int rootval = preorder[preorderIdx++];
        TreeNode root = new TreeNode(rootval);

        int mid = mp.get(rootval);

        root.left = build(preorder,start,mid-1);
        root.right = build(preorder,mid+1,end);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        mp = new HashMap<>();

        for(int i=0 ; i<inorder.length ; i++){
            mp.put(inorder[i],i);
        }
        
        preorderIdx = 0;

        return build(preorder , 0 , preorder.length-1);
    }
    public static void main(String[] args) {
        
    }
}
