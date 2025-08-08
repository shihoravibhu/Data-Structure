// 75. Write a menu driven program to implement Binary Search Tree (BST) & perform 
// following operations:  
// • Insert a node 
// • Delete a node 
// • Search a node 
// • Preorder Traversal 
// • Postorder Traversal 
// • Inorder Traversal 

#include<stdio.h>
#include<stdlib.h>

struct TreeNode{
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
};

struct TreeNode* createNode(int val){

    struct TreeNode* newNode = (struct TreeNode*) malloc(sizeof(struct TreeNode));

    newNode->data = val;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;

}

struct TreeNode* insertNode(struct TreeNode* root,int val){

    if(root == NULL){                // when first element enter

        return createNode(val);
    }

    if(val < root->data){
        root->left = insertNode(root->left,val);
    }
    else{
        root->right = insertNode(root->right,val);
    }

    return root;

}

struct TreeNode* getInOrderSuccessor(struct TreeNode* root){        // leftMost Node (Smallest In RightSubtree)

    while(root != NULL && root->left != NULL){
        root = root->left;
    }

    return root;

}

struct TreeNode* DelNode(struct TreeNode* root,int val){

    if(root == NULL){
        printf("Empty.");
        return NULL;
    }
    if(val < root->data){
        root->left = DelNode(root->left,val);
    }
    else if(val > root->data){
        root->right = DelNode(root->right,val);
    }
    else{       // if val == root->data matched

        if(root->left == NULL && root->right == NULL){      // case 1 Node With zero child
            struct TreeNode* temp = root;
            free(root);   
            return NULL;         
        }
        else if(root->left == NULL){                        // case 2 Node With one child (only right child)
            struct TreeNode* temp = root->right;
            free(root); 
            return temp;
        }      
        else if(root->right == NULL){                        // case 2 Node With one child (only left child)
            struct TreeNode* temp = root->left;
            free(root); 
            return temp;
        }
        else{                               // case 3 Node with two child (Both Right And Left Exists)  
            struct TreeNode* in = getInOrderSuccessor(root->right);
            root->data = in->data;
            root->right = DelNode(root->right,in->data);
        }
        
        return root;
    }
}

struct TreeNode* Search(struct TreeNode* root,int val){

    if(root == NULL){
        return NULL;
    }

    if(root->data == val){
        return root;
    }
    else if(val < root->data){
        root->left = Search(root->left,val);
    }
    else{
        root->right = Search(root->right,val);
    }
    
}

void inOrderTraversal(struct TreeNode* root){

    if(root != NULL){
        inOrderTraversal(root->left);
        printf("%d ",root->data);
        inOrderTraversal(root->right);        
    }

}
void preOrderTraversal(struct TreeNode* root){

    if(root != NULL){
        printf("%d ",root->data);
        inOrderTraversal(root->left);
        inOrderTraversal(root->right);        
    }

}
void postOrderTraversal(struct TreeNode* root){

    if(root != NULL){
        inOrderTraversal(root->left);
        inOrderTraversal(root->right);        
        printf("%d ",root->data);
    }

}

int isSame(struct TreeNode* root,struct TreeNode* root2){

    if(root == NULL || root2 == NULL){
        return root == root2;
    }

    return (root->data == root2->data) && isSame(root->left,root2->left) && isSame(root->right,root2->right);


}


void main(){

    struct TreeNode* root = NULL;
    struct TreeNode* root2 = NULL;

    root = insertNode(root,30);
    insertNode(root,20);
    insertNode(root,10);

    root2 = insertNode(root2,30);
    insertNode(root2,20);
    insertNode(root2,70);
   

    inOrderTraversal(root);

    printf("\n");
    
    inOrderTraversal(root2);
    printf("\n");

    printf("%d",isSame(root,root2));
    
}