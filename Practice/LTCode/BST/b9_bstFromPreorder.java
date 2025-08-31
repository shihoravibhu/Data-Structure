package BST;
// 1008. Construct Binary Search Tree from Preorder Traversal

public class b9_bstFromPreorder {

     // public int i=0 apde aa rite pan kari sakiye to array i ni jarur nathi   

    public TreeNode helper(int[] preorder , int[] i ,int  uBound){

        
        // If we've used all elements OR current value is greater than the allowed upper bound, stop recursion
        if(i[0] == preorder.length || preorder[i[0]] > uBound){
            return null;
        }
        
        // Create the root node from the current index and move index forward
        TreeNode root = new TreeNode(preorder[i[0]++]);
        
        // Left subtree: elements less than root value
        root.left = helper(preorder , i , root.val); // leftvma insert karti vakhte apde je na child tarike insert kariye chiye te root ni j value jovani rese so

        // Right subtree: elements less than upper bound but greater than root value
        root.right = helper(preorder , i , uBound);    // ahiya jyare apde root na right ma insert karta hoi tyare apde root na perent ni value jovani k ena karta to kyak moti nathi ne em jo moti no hoi to tene insert kari nakhvano 

        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        
        return helper(preorder , new int[] {0} , Integer.MAX_VALUE);

        // java ma apde pointer etle varable ne refrance thi pass nathi kari sakta so ahiya apde refreance thi value badlavi che karn k ahiya recursion ma function scope value nakvathi 
        // tukma (Your recursion will basically restart index every time.)
    }

    // or

//     public static TreeNode insert(TreeNode root, int val) {
//         if(root == null) {
//             root = new TreeNode(val);
//             return root;
//         }
//         if(root.val<val) {
//             root.right = insert(root.right,val);
//         }
//         else {
//            root.left = insert(root.left,val);
//         }
//         return root;
//     }
//     public TreeNode bstFromPreorder(int[] preorder) {
//        TreeNode root = new TreeNode(preorder[0]); 
//        for(int i=1; i<preorder.length; i++) {
//         root = insert(root,preorder[i]);
//        }
//        return root;
//     }

    public static void main(String[] args) {
        
    }
}
