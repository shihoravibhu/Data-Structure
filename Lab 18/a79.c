// 79. Write a program to construct a binary tree from given Postorder and Preorder traversal sequence. 

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

int valueToIndex[10000];  // Lookup table: stores index of each value in postOrder[]

struct TreeNode {
   int data;
   struct TreeNode *left;
   struct TreeNode *right;
};

// Create a new tree TreeNode with given value
struct TreeNode* createTreeNode(int val) {
   struct TreeNode* newTreeNode = (struct TreeNode*)malloc(sizeof(struct TreeNode));
   newTreeNode->data = val;
   newTreeNode->left = NULL;
   newTreeNode->right = NULL;
   return newTreeNode;
}

// Utility: Inorder Traversal (Left → Root → Right)
void inOrder(struct TreeNode *root ) {
   if(root == NULL) return;
   inOrder(root->left);
   printf("%d ", root->data);
   inOrder(root->right);
}

/*
   Recursive helper to build tree from preorder[] and postorder[]
   Parameters:
   - i1, i2 → range in preorder[]
   - j1, j2 → range in postorder[]
   - preOrder[], postOrder[] → traversal arrays

   Logic:
   1. Root is always preOrder[i1].
   2. If only one TreeNode, return it.
   3. Otherwise:
      - Next preorder element (preOrder[i1+1]) must belong to the left subtree.
      - Find its index in postOrder[] using valueToIndex[].
      - Calculate size of left subtree.
      - Recursively build left and right subtrees using the index ranges.
*/

struct TreeNode* helper(int i1, int i2, int j1, int j2, int preOrder[], int postOrder[]) { // O(n)
   // Base case: empty range → no TreeNode
   if(i1 > i2 || j1 > j2) return NULL;

   // Create root TreeNode from current preorder index
   struct TreeNode *root = createTreeNode(preOrder[i1]);

   // If only one TreeNode, return it directly
   if(i1 == i2) return root;

   // Index of left subtree root (preOrder[i1+1]) in postOrder[]
   int r = valueToIndex[preOrder[i1+1]];

   // Size of left subtree
   int size = r - j1 + 1;

   // Recursively build left and right subtrees
   root->left = helper(i1+1, i1+size, j1, r, preOrder, postOrder);
   root->right = helper(i1+size+1, i2, r+1, j2-1, preOrder, postOrder);

   return root;
}

int main() {
   int preOrder[] = {1,2,4,5,3,6,7};
   int postOrder[] = {4,5,2,6,7,3,1};

   int n = sizeof(preOrder) / sizeof(preOrder[0]);

   // Build lookup: value → index in postOrder[]
   for(int i = 0; i < n; i++) {
      valueToIndex[postOrder[i]] = i;
   }

   // Construct the binary tree
   struct TreeNode *root = helper(0, n-1, 0, n-1, preOrder, postOrder);

   // Print inorder traversal of constructed tree
   printf("Inorder Traversal: ");
   inOrder(root);
   printf("\n");

   return 0;
}
