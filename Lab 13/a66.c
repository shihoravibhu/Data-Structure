// 66. Write a program to sort elements of a linked list.

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *insertAtFirst(struct Node *head, int x)
{

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    newNode->data = x;
    newNode->next = head;

    head = newNode;

    return head;
}

struct Node *insertAtLast(struct Node *head, int x)
{

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    newNode->data = x;
    newNode->next = NULL;

    if (head == NULL)
    {
        head = newNode;
        return head;
    }

    struct Node *curr = head;

    while (curr->next != NULL)
    {

        curr = curr->next;
    }

    curr->next = newNode;

    return head;
}

void display(struct Node *head)
{

    struct Node *curr = head;

    if (curr == NULL)
    {
        printf("List Is Empty\n");
        return;
    }

    while (curr != NULL)
    {
        printf("%d -> ", curr->data);
        curr = curr->next;
    }
    printf("NULL\n");
}

void sortArray(struct Node **head){

    if(*head == NULL && (*head)->next == NULL ){
        return ;
    }

    int swapped;
    struct Node ** curr;

    do{
        swapped = 0;
        curr=head;

        while(*curr != NULL && (*curr)->next != NULL){
            struct Node* first = *curr;
            struct Node* second = (*curr)->next;

            if(first->data > second->data){
                first->next = second->next;
                second->next = first;

                *curr = second;

                swapped = 1;    
            }

            curr = &((*curr)->next);

        }


    }while(swapped);

}

// struct Node* swapKthNode(struct Node* head, struct Node* curr, struct Node* curr2){

//      if (curr == curr2) return head;
//     struct Node* temp1 = (curr == NULL) ? head : curr->next;
//     struct Node* temp2 = (curr2 == NULL) ? head : curr2->next;

//     if (temp1 == NULL || temp2 == NULL) return head;

    
//     if (temp1 == curr2) {  // temp1 just before temp2
//         struct Node* forw = temp2->next;
//         if (curr) curr->next = temp2;
//         else head = temp2;
//         temp2->next = temp1;
//         temp1->next = forw;
//         return head;
//     }
//     else if (temp2 == curr) {  // temp2 just before temp1
//         struct Node* forw = temp1->next;
//         if (curr2) curr2->next = temp1;
//         else head = temp1;
//         temp1->next = temp2;
//         temp2->next = forw;
//         return head;
//     }
    
//     struct Node* forw1 = temp1->next;
//     struct Node* forw2 = temp2->next;
//     temp1->next = forw2;
//     temp2->next = forw1;

//     if (curr != NULL){
//         curr->next = temp2;
//     }
//     else{
//         head = temp2;
//     }

//     if (curr2 != NULL){
//         curr2->next = temp1;
//     }
//     else{
//         head = temp1;
//     }

//     temp1->next = forw2;
//     temp2->next = forw1;

//     return head;
// }

// struct Node* sort(struct Node* head){

//     struct Node* curr = head;
//     struct Node* i, *j;
//     int min;
//     struct Node* temp, *jp;
//     struct Node* ip = NULL;

//     for(i = head ; i != NULL && i->next != NULL ; i = i->next){

//         min = i->info;
//         temp = ip;   // backup previous of i
//         for(jp = i, j = i->next ; j != NULL ; jp = jp->next, j = j->next){
//             if(j->info < min){
//                 min = j->info;
//                 temp = jp;
//             }
//         }

//         if(min < i->info){
//             head = swapKthNode(head, ip, temp);
//             // after swap, update `i` properly
//             if (ip == NULL)
//                 i = head;
//             else
//                 i = ip->next;
//         }
//         ip = i;
//     }
//     return head;
// }

void main()
{

    struct Node *h1 = NULL;

    h1 = insertAtFirst(h1, 1);
    h1 = insertAtFirst(h1, 3);
    h1 = insertAtFirst(h1, 9);
    h1 = insertAtFirst(h1, 7);
    h1 = insertAtFirst(h1, 99);
    h1 = insertAtFirst(h1, 10);

    display(h1);

    sortArray(&h1);

    display(h1);
}