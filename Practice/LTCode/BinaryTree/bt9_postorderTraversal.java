// 145. Binary Tree Postorder Traversal

package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class bt9_postorderTraversal {

     public void traverse(TreeNode root ,List<Integer> list){

        if(root == null){
            return;
        }

        traverse(root.left,list);
        traverse(root.right,list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        traverse(root,list);

        return list;
        
    }
    public static void main(String[] args) {
        
    }
}
