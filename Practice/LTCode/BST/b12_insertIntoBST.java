// 701. Insert into a Binary Search Tree

package BST;

public class b12_insertIntoBST {
     public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root == null){                        
            return new TreeNode(val);
        }

        if(root.val < val){
            root.right = insertIntoBST(root.right,val);
        }
        else{
            root.left = insertIntoBST(root.left,val);
        }

        return root;
    }
    public static void main(String[] args) {
        
    }
}
