// 64. Write a program to reverse a linked list.

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

struct Node* reverse(struct Node* head){

    if(head == NULL){
        return NULL;
    }

    struct Node* prev = NULL;
    struct Node* curr = head;
    struct Node* next = NULL;
    
    while(curr != NULL){

        next = curr->next;
        curr->next = prev;

        prev = curr;
        curr = next;
    }

    return prev;

}




void main()
{

    struct Node* h1 = NULL;   
    

    h1 = insertAtFirst(h1, 9);    
    h1 = insertAtFirst(h1, 8);    
    h1 = insertAtFirst(h1, 7);
    h1 = insertAtFirst(h1, 6); 
         
    display(h1);
    
    h1 = reverse(h1);
    
    display(h1);  

}