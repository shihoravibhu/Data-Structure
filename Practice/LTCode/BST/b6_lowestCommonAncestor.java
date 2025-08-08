// 235. Lowest Common Ancestor of a Binary Search Tree

package BST;

public class b6_lowestCommonAncestor {
      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null){
            return null;
        }

        if(root.val > p.val && root.val > q.val){           // etle k banne p and q bey root na left ma exisits kare che to left mate call
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        else{       // ek root na left ma and ek root na right ma exisits kare che so aa case and ama return direct root (LCA)

        return root;

        }
        
    }
    public static void main(String[] args) {
        
    }
}
