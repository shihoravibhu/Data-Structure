// 94. Binary Tree Inorder Traversal

package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class bt7_inorderTraversal {

      public void traverse(TreeNode root ,List<Integer> list){

        if(root == null){
            return;
        }

        traverse(root.left,list);
        list.add(root.val);
        traverse(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        traverse(root,list);

        return list;

        
    }
    public static void main(String[] args) {
        
    }
}
