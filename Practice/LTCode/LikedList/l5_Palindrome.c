// 234. Palindrome Linked List

#include<stdio.h>
#include<stdbool.h>

 struct ListNode {
     int val;
     struct ListNode *next;
 };

bool isPalindrome(struct ListNode* head) {

    if(head == NULL){
        return true;
    }

    struct ListNode* slow = head;
    struct ListNode* fast = head;

    while(fast->next != NULL && fast->next->next != NULL){   // To Find Middle

        slow = slow->next;
        fast = fast->next->next;
    }


    struct ListNode* head2 = slow->next;
    slow->next = NULL;

    struct ListNode* prev = NULL;   
    struct ListNode* curr = head2;
    struct ListNode* next = NULL;

    while(curr != NULL){            // Rev Second Half List

       next = curr->next;
       curr->next = prev;

       prev = curr;
       curr = next;

    }

    struct ListNode* curr2 = head;
    struct ListNode* curr3 = prev;   

    while(curr2 != NULL && curr3 != NULL){      // Comparee First Half And Second Rev Half

        if(curr2->val != curr3->val){
            return false;
        }

        curr2 = curr2->next;
        curr3 = curr3->next;
    }

    return true;
    
}

void main(){

}