// 606. Construct String from Binary Tree

package BinaryTree;

public class bt15_tree2str {
    public String tree2str(TreeNode root) {
        
        if(root==null){
            return "";
        }

        StringBuilder sb = new StringBuilder(""+root.val);

        if(root.left != null || root.right != null){
            sb.append("("+tree2str(root.left)+")");
        }

        if(root.right != null){
            sb.append("("+tree2str(root.right)+")");
        }

        return sb.toString();
        
    }
    public static void main(String[] args) {
        
    }
}
