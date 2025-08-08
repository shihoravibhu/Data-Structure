// 144. Binary Tree Preorder, Traversal

package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class bt8_preorderTraversal {

      public void traverse(TreeNode root ,List<Integer> list){

        if(root == null){
            return;
        }

        list.add(root.val);
        traverse(root.left,list);
        traverse(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        traverse(root,list);

        return list;
        
    }
    public static void main(String[] args) {
        
    }
}
