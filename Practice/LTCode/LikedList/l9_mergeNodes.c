// 2181. Merge Nodes in Between Zeros

#include<stdio.h>
 
 struct ListNode {
      int val;
     struct ListNode *next;
 };

 struct ListNode* mergeNodes(struct ListNode* head) {

    for (struct ListNode *curr = head->next, *zero = head; curr != NULL;
         curr = curr->next) {

        if (curr->val != 0) {
            zero->val += curr->val;
        }

        else {
            zero->next = curr->next == NULL ? NULL : curr;
            zero = curr;
        }
    }

    return head;
}

void main(){

}