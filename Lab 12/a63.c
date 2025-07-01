// 63. Write a program to copy a linked list.

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

// Method-1

// struct Node* copy(struct Node* head){

//     if(head == NULL){
//         return NULL;
//     }

//     struct Node* newhead = (struct Node*) malloc(sizeof(struct Node));
//     newhead->data = head->data;
//     newhead->next = NULL;

//     struct Node* oldtemp = head->next;
//     struct Node* newtemp = newhead;

//     while(oldtemp != NULL){

//         struct Node* copytemp = (struct Node*) malloc(sizeof(struct Node));
//         copytemp->data = oldtemp->data;
//         copytemp->next = NULL;

//         newtemp->next = copytemp;
//         oldtemp = oldtemp->next;
//         newtemp = newtemp->next;

//     }

//     return newhead;

// }

// Method-2

struct Node *copy(struct Node *head)
{

    if (head == NULL)
    {
        return NULL;
    }

    struct Node *newhead = (struct Node *)malloc(sizeof(struct Node));

    struct Node *curr = head;
    struct Node *curr2 = newhead;
    
    while (curr != NULL)
    {

        curr2->data = curr->data;

        if (curr->next != NULL){
            curr2->next = (struct Node *)malloc(sizeof(struct Node));
        }
        
        else{
            curr2->next = NULL;
        }
        
        curr = curr->next;
        curr2 = curr2->next;
    }

    return newhead;
}

void main()
{

    struct Node *h1 = NULL;
    struct Node *h2 = NULL;

    h1 = insertAtFirst(h1, 9);
    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 7);
    h1 = insertAtFirst(h1, 6);
    h1 = insertAtFirst(h1, 6);

    h2 = copy(h1);

    display(h1);

    display(h2);
}
