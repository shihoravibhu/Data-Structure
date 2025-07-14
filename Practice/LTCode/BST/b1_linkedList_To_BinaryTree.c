// LeetCode 109: Convert Sorted List to Binary Search Tree
// This function converts a sorted singly-linked list to a height-balanced BST.

#include <stdio.h>
#include <stdlib.h>

/**
 * Definition for singly-linked list.
 */
struct ListNode {
    int val;
    struct ListNode *next;
};

/**
 * Definition for a binary tree node.
 */
struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};


struct TreeNode* sortedListToBST(struct ListNode* head) {
    if (head == NULL) {
        return NULL;
    }
    if (head->next == NULL) { // Only one element, create leaf
        struct TreeNode* root = (struct TreeNode*) malloc(sizeof(struct TreeNode));
        root->val = head->val;
        root->left = NULL;
        root->right = NULL;
        return root;
    }

    // Find the middle node (slow will point to middle)
    struct ListNode* slow = head;
    struct ListNode* fast = head;
    struct ListNode* prev = NULL;

    while (fast != NULL && fast->next != NULL) {
        prev = slow;
        slow = slow->next;
        fast = fast->next->next;
    }

    if (prev != NULL) { // Disconnect left half
        prev->next = NULL;
    }

    struct TreeNode* root = (struct TreeNode*) malloc(sizeof(struct TreeNode));
    root->val = slow->val;
    root->left = sortedListToBST((slow == head) ? NULL : head); // if slow==head, no left part
    root->right = sortedListToBST(slow->next);

    return root;
}

// Helper function to print inorder traversal of BST
void inorder(struct TreeNode* root) {
    if (root == NULL) return;
    inorder(root->left);
    printf("%d ", root->val);
    inorder(root->right);
}

// Helper function to create a new ListNode
struct ListNode* newListNode(int val) {
    struct ListNode* node = (struct ListNode*) malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;
    return node;
}

int main() {
    // Example: Create sorted linked list  -10 -> -3 -> 0 -> 5 -> 9
    struct ListNode* head = newListNode(-10);
    head->next = newListNode(-3);
    head->next->next = newListNode(0);
    head->next->next->next = newListNode(5);
    head->next->next->next->next = newListNode(9);

    struct TreeNode* bst = sortedListToBST(head);

    printf("Inorder traversal of constructed BST: ");
    inorder(bst); // Expected output: -10 -3 0 5 9
    printf("\n");

    return 0;
}