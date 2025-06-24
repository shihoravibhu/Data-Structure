// 59. Write a program to remove the duplicates nodes from given sorted Linked List. 
//  • Input: 1 → 1 → 6 → 13 → 13 → 13 → 27 → 27 
//  • Output: 1 → 6 → 13 → 27 

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

void compare(struct Node *head)
{

    struct Node *curr = head;

    while(curr != NULL && curr->next != NULL){

        if(curr->data == curr->next->data){

            struct Node* temp = curr->next;
            curr->next = curr->next->next;
            free(temp);
        }

        else{

            curr = curr->next;
        }

    }
}

void main()
{

    struct Node *h1 = NULL;   

    h1 = insertAtFirst(h1, 9);
    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 8);    
    h1 = insertAtFirst(h1, 7);
    h1 = insertAtFirst(h1, 6);  
    h1 = insertAtFirst(h1, 6);      

    display(h1);    
    
    compare(h1);

    display(h1);
}
