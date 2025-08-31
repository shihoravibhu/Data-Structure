// 79. Write a program to construct a binary tree from given Postorder and Preorder 
// traversal sequence. 

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct TreeNode{
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
};

int preIdx = 0 ;
int postIdx = 0 ;

// struct TreeNode* buildTreeByPrePos(struct TreeNode* root , int preorder[] , int postorder[]) {

//     root = (struct TreeNode*) malloc(sizeof(struct TreeNode));
//     root->data = preorder[preIdx++];
//     root->left = NULL;
//     root->right = NULL;

//    if(root->data !=  postorder[postIdx]){
//         root->left = buildTreeByPrePos(root->left,preorder,postorder);
//    }

//    if(root->data !=  postorder[postIdx]){
//         root->right = buildTreeByPrePos(root->right,preorder,postorder);
//    }

//    postIdx++;

//    return root;
// }

// Function to build a binary tree from preorder[] and postorder[]
// Only works for FULL binary trees (0 or 2 children for each node)
struct TreeNode* buildTreeByPrePost(int preorder[], int postorder[],
                                    int* preIdx, int l, int h, int size) {
    // Base case: if indexes go out of range, return NULL
    if (*preIdx >= size || l > h) return NULL;

    // Create root from current preorder index
    struct TreeNode* root = (struct TreeNode*) malloc(sizeof(struct TreeNode));
    root->data = preorder[*preIdx];
    root->left = root->right = NULL;
    (*preIdx)++;   // move preorder pointer ahead

    // If this subtree has only one node, return it
    if (l == h || *preIdx >= size) return root;

    // Find the index of next preorder element in postorder[]
    int i;
    for (i = l; i <= h; i++) {
        if (postorder[i] == preorder[*preIdx]) break;
    }

    // Using the found index, recursively build left and right subtrees
    if (i <= h) {
        root->left  = buildTreeByPrePost(preorder, postorder, preIdx, l, i, size);
        root->right = buildTreeByPrePost(preorder, postorder, preIdx, i+1, h-1, size);
    }

    return root;
}


void inOrderTraversal(struct TreeNode* root){

    if(root != NULL){
        inOrderTraversal(root->left);
        printf("%d ",root->data);
        inOrderTraversal(root->right);        
    }

}

void main(){

    struct TreeNode* root = NULL;    

    // int preorder[] = {10,5,1,3,7,15,13,18};
    // int postorder[] = {3,1,7,5,13,18,15,10};

    int preorder[] = {5,3,1,2,4,7,6,8};
    int postorder[] = {2,1,4,3,6,8,7,5};
   
    root = buildTreeByPrePos(root , preorder,postorder);         

    printf("root  : \n");
    inOrderTraversal(root);
    printf("\n");        
    
}