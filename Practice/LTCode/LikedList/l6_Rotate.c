// 61. Rotate List

#include<stdio.h>

 struct ListNode {
     int val;
     struct ListNode *next;
 };

struct ListNode* rotateRight(struct ListNode* head, int k) {

    if (head == NULL || head->next == NULL) {
        return head;
    }

    int n = 1;
    struct ListNode* curr = head;

    while (curr->next != NULL) { // For Count Total Node
        curr = curr->next;
        n++;
    }

    // Last Node Ne Head Sathe link
    curr->next = head;

    k = k % n; // To Avoid Unnnecery Rotate for example n=5 and k = 5

    k = n - k; // Convert to position to break

    curr = head;

    for (int i = 1; i < k; i++) { // Je element ne rotate karvana che ena agla
                                  // element sudgi javanu
        curr = curr->next;
    }

    struct ListNode* newHead = curr->next;
    curr->next = NULL;
   

    return newHead;
}

void main(){

}