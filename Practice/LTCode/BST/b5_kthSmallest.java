// 230. Kth Smallest Element in a BST

package BST;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class b5_kthSmallest {
    
    // public void inOrder(TreeNode root,List<Integer> list){
    //     if(root == null){
    //         return ;
    //     }

    //     inOrder(root.left,list);
    //     list.add(root.val);
    //     inOrder(root.right,list);

    // }
    // public int kthSmallest(TreeNode root, int k) {

    // List<Integer> list = new ArrayList<>();

    //     if(root == null){
    //         return 0;
    //     }

    //     inOrder(root,list);

    //     return list.get(k-1);
        
    // }

    // or (Optimize)

    int result = -1;
    int count = 0;

    public void inOrder(TreeNode root ,int k){      // karn k inorder assending order ma value ape
        if(root == null){
            return;
        }

        inOrder(root.left,k);

        count++;       
        if(count == k){
            result = root.val;
            return;   // tarminate 
        }

        inOrder(root.right,k);

    }
    public int kthSmallest(TreeNode root, int k) {
 
        inOrder(root,k);

        return result;
        
    }
    public static void main(String[] args) {
        
    }
}
