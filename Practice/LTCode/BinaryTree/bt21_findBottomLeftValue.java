// 513. Find Bottom Left Tree Value

package BinaryTree;

public class bt21_findBottomLeftValue {
    private int ans , maxDepth = -1;

    public void dfs(TreeNode root , int depth){
        if(root == null){
            return;
        }

        if(depth > maxDepth){
            ans = root.val;
            maxDepth = depth;
        }

        dfs(root.left,depth+1);
        dfs(root.right,depth+1);

    }
    public int findBottomLeftValue(TreeNode root) {      

        dfs(root,0);

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
