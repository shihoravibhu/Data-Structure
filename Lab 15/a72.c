// 72. Write a menu driven program to implement following operations on the doubly 
// linked list. 
// • Insert a node at the front of the linked list. 
// • Delete a node from specified position. 
// • Insert a node at the end of the linked list. (Home Work) 
// • Display all nodes. (Home Work) 

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
    struct Node *prev;
};

struct Node* insertAtFirst(struct Node* head, int x) {

    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = x;
    newNode->prev = NULL;
    newNode->next = head;

    if (head != NULL) {
        head->prev = newNode;
    }

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
    newNode->prev = curr;

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
        printf("%d <-> ", curr->data);
        curr = curr->next;
    }
    printf("NULL\n");
}

struct Node* deleteAtFirst(struct Node* head) {
    if (head == NULL) return NULL;  // list empty

    struct Node* temp = head;
    head = head->next;

    if (head != NULL) {
        head->prev = NULL;
    }

    free(temp);
    return head;
}

struct Node* deleteAtLast(struct Node* head) {
    if (head == NULL) return NULL;        // empty list
    if (head->next == NULL) {             // only one node
        free(head);
        return NULL;
    }

    struct Node* curr = head;
    while (curr->next->next != NULL) {    // stop at 2nd last node
        curr = curr->next;
    }

    struct Node* last = curr->next;       // last node
    curr->next = NULL;                    // unlink last node
    free(last);

    return head;
}


struct Node* deleteNodeFromPosition(int n , struct Node* head){

    struct Node* curr = head;

    if (head == NULL)
    {
        printf("List Is Empty");
        
        return NULL;
    }

    if (n < 1) {
        printf("Invalid position\n");
        return head;
    }

    if(n==1){  // First Node Ne Delete Karva
        struct Node* temp = head;
        head = head->next;
        head->prev = NULL;
        free(temp);
       
        return head;
    }

    int i=1;

    struct Node* temp2;  // curr->next ne free karva mate apde temp variable lidhel che 

    while(curr->next!=NULL){

        if(i==(n-1)){
            break;
        }

        curr = curr->next;
        i++;

    }

    temp2 = curr->next;   

    curr->next = curr->next->next;
    curr->next->next->prev = curr;

    free(temp2);

    return head;
}




void main()
{

    struct Node *h1 = NULL;

    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 7);
    h1 = insertAtFirst(h1, 6);
    h1 = insertAtFirst(h1, 5);
    h1 = insertAtFirst(h1, 4);
    h1 = insertAtFirst(h1, 3);
    h1 = insertAtFirst(h1, 2);
    h1 = insertAtFirst(h1, 1);
    
    display(h1);

    h1 = insertAtLast(h1, 9);
    display(h1);
    
    h1 = deleteNodeFromPosition(1,h1);
    display(h1);

}
