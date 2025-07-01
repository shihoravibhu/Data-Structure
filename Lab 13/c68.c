// 68. Write a program to swap two consecutive nodes in the linked list. Don’t change 
// the values of nodes, implement by changing the link of the nodes. 
// • Input: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 
// • Output: 2 → 1 → 4 → 3 → 6 → 5 → 8 → 7

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

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

struct Node* swapPairs(struct Node *head)
{

    if(head == NULL || head->next == NULL) return head;

    struct Node* first = head; 
    struct Node* sec = head->next; 
    struct Node* prev = NULL;

    while(first != NULL && sec != NULL){

        struct Node* third = sec->next;
        first->next = third;
        sec->next = first;

        if(prev != NULL){
            prev->next = sec;
        }
        else{
            head = sec; //second element head banavano
        }

        // update
        prev = first;
        first = third;

        if(third!=NULL){
            sec = third->next;
        }
        else{
            sec=NULL;
        }

    } 

    return head;
}

void main()
{

    struct Node *h1 = NULL;

    h1 = insertAtFirst(h1, 12);
    h1 = insertAtFirst(h1, 6);
    h1 = insertAtFirst(h1, 9);
    h1 = insertAtFirst(h1, 18);
    h1 = insertAtFirst(h1, 5);
    h1 = insertAtFirst(h1, 25);

    display(h1);

    h1 = swapPairs(h1);

    display(h1);
}