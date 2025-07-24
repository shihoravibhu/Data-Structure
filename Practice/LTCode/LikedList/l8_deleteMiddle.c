// 2095. Delete the Middle Node of a Linked List

#include<stdio.h>
 
 struct ListNode {
      int val;
     struct ListNode *next;
 };

struct ListNode* deleteMiddle(struct ListNode* head) {

    if(head == NULL || head->next==NULL){
        return NULL;
    }

    struct ListNode* curr = head;
    int len = 0;

    while(curr!=NULL){ // length
        curr = curr->next;
        len++;
    }

    if(len == 2){
        free(head->next);
        head->next = NULL;
        return head;
    }

    int mid = len / 2;

    curr = head;

    for(int i=0 ; i<mid-1 ; i++){
        curr = curr->next;
    }    

    struct ListNode* temp = curr->next;
    curr->next = curr->next->next;
    free(temp);

    return head;


    // or 

    //   if (head == NULL || head->next == NULL) {
    //     return NULL;
    // }

    // struct ListNode* slow = head;
    // struct ListNode* fast = head;
    // struct ListNode* prev = NULL;

    //   while (fast != NULL && fast->next != NULL) {
    //     fast = fast->next->next;
    //     prev = slow;
    //     slow = slow->next;
    // }

    // prev->next = slow->next;
    // free(slow);

    // return head;
    
}

void main(){

}