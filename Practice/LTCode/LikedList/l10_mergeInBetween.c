// 1669. Merge In Between Linked Lists

#include<stdio.h>
#include<stdlib.h>

 struct ListNode {
     int val;
   struct ListNode *next;
 };
 


struct ListNode* mergeInBetween(struct ListNode* list1, int a, int b, struct ListNode* list2){

    struct ListNode* curr = list1;
    struct ListNode* curr2 = list1;

    int count = 0;

    while(count < a-1){  // Move to node at index a - 1
        curr = curr->next;
        count++;
    }

    count = 0;
    while(count <= b){       // Move to node at index b    
        curr2 = curr2->next;  // b pachinu
        count++;
    }

    curr->next = list2;         // a pelanu + list2

    struct ListNode* curr3 = list2;

    while(curr3->next != NULL){ // Go to end of list2
        curr3 = curr3->next;
    }
    
    curr3->next = curr2;        // Connect end of list2 to after B

    return list1;
}

void main(){
    
}