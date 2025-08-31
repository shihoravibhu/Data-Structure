// 450. Delete Node in a BST
// This function deletes a node with a given key from a Binary Search Tree.

#include <stdio.h>
#include <stdlib.h>

// struct TreeNode* getInOrderSuccessor(struct TreeNode* root) {
//     while (root != NULL && root->left != NULL) {
//         root = root->left;
//     }
//     return root;
// }

// struct TreeNode* deleteNode(struct TreeNode* root, int key) {
//     if (root == NULL) {
//         return NULL;
//     }

//     if (key < root->val) {
//         root->left = deleteNode(root->left, key);
//     }
//     else if (key > root->val) {
//         root->right = deleteNode(root->right, key);
//     }
//     else {      // key == root->key
//         if (root->left == NULL && root->right == NULL) {         // case 1: no child
//             free(root);
//             return NULL;
//         }
//         else if (root->left == NULL) {           // case 2: only right
//             struct TreeNode* temp = root->right;
//             free(root);
//             return temp;
//         }
//         else if (root->right == NULL) {          // case 2: only left
//             struct TreeNode* temp = root->left;
//             free(root);
//             return temp;
//         }
//         else {                                   // case 3: two children
//             struct TreeNode* in = getInOrderSuccessor(root->right);
//             root->val = in->val;
//             root->right = deleteNode(root->right, in->val);
//         }
//     }
//     return root;
// }


// or

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};


struct TreeNode* inorderPredecessor(struct TreeNode* root) {
    root = root->left;
    while (root->right != NULL) {
        root = root->right;
    }
    return root;
}


struct TreeNode* deleteNode(struct TreeNode* root, int key) {
    if (root == NULL)
        return NULL;

    if (key < root->val) {
        root->left = deleteNode(root->left, key);
    } else if (key > root->val) {
        root->right = deleteNode(root->right, key);
    } else {
        // Node found
        if (root->left == NULL && root->right == NULL) {
            free(root);
            return NULL;
        } else if (root->left == NULL) {
            struct TreeNode* temp = root->right;
            free(root);
            return temp;
        } else if (root->right == NULL) {
            struct TreeNode* temp = root->left;
            free(root);
            return temp;
        } else {
            struct TreeNode* ipre = inorderPredecessor(root);
            root->val = ipre->val;
            root->left = deleteNode(root->left, ipre->val);
        }
    }
    return root;
}

