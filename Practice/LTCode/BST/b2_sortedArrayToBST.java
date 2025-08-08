// 108. Convert Sorted Array to Binary Search Tree

package BST;

// import javax.swing.tree.TreeNode;
 
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
        this.left = left;
          this.right = right;
      }
  }
 

public class b2_sortedArrayToBST {
     TreeNode helper(int[] nums , int st , int en){
        if(st > en){
            return null;
        }

        int mid = st + (en-st)/2;

        TreeNode root = new TreeNode(nums[mid]);    //ahiya mid che tene pela root

        root.left = helper(nums,st,mid-1);        // mid karta jeni value ochi hoi te root na left ma avse
        root.right = helper(nums,mid+1,en);     // jeni vadhare te root na right ma

        return root;

    }

    public TreeNode sortedArrayToBST(int[] nums) {

        // ahiya nums array sorted order ma che mena sk inOrder ma che 
        
        return helper(nums , 0 , nums.length - 1);
    }
    public static void main(String[] args) {
        
    }
}
