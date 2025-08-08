// 938. Range Sum of BST

package BST;

public class b4_rangeSumBST {
    int ans  = 0;
    
     public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root == null){
            return 0;
        }
       
        if(root.val >= low && root.val <= high){

        rangeSumBST(root.left,low,high);
        ans += root.val;
        rangeSumBST(root.right,low,high);

        }
        else if(root.val < low){

        rangeSumBST(root.right,low,high);

        }
        else if(root.val > high){

        rangeSumBST(root.left,low,high);

        }

        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}
