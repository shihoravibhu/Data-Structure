// 102. Binary Tree Level Order Traversal

package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bt18_levelOrder {
     public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<TreeNode>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();

        if(root == null){
            return list;
        }

        que.add(root);

        while(!que.isEmpty()){
            int levelNum = que.size();
            List<Integer> sublist = new LinkedList<>();

            for(int i=0 ; i<levelNum ; i++){
                if(que.peek().left != null) que.add(que.peek().left);
                if(que.peek().right != null) que.add(que.peek().right);

                sublist.add(que.poll().val);
            }

            list.add(sublist);
        }

        return list;
        
    }


// or


// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>>arr=new ArrayList<>();
//         travel(0,root,arr);
//         return arr;
//     }
//     public static void travel(int level,TreeNode root,List<List<Integer>>arr){
//         if(root == null) return;
//         if(level >= arr.size()){
//             arr.add(new ArrayList<>());
//         }
//             arr.get(level).add(root.val);
//             travel(level +1,root.left,arr);
//             travel(level +1,root.right,arr);
        
//     }
  
// }
    public static void main(String[] args) {
        
    }
}
