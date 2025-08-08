// 99. Recover Binary Search Tree

package BST;

public class b8_recoverTree {

    TreeNode first = null;
    TreeNode sec = null;
    TreeNode prev = null;

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        inOrder(root.left);

        if(prev != null && root.val < prev.val){

            if(first == null){
                first = prev;
            }
            sec = root;
        }

        prev = root;

        inOrder(prev.right);
    }
    public void recoverTree(TreeNode root) {
        
        inOrder(root);

        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;
    }
    public static void main(String[] args) {
        
    }
}
