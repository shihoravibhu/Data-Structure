// 107. Binary Tree Level Order Traversal II

package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bt20_levelOrderBottom {
    public static void travel(int level,TreeNode root,List<List<Integer>>arr){
        if(root == null) return;
        if(level >= arr.size()){
            arr.add(new ArrayList<>());
        }
            arr.get(level).add(root.val);
            travel(level +1,root.left,arr);
            travel(level +1,root.right,arr);
        
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>arr=new ArrayList<>();
        travel(0,root,arr);

        Collections.reverse(arr);

        return arr;
    }
    public static void main(String[] args) {
        
    }
}
