// 69. Write a menu driven program to implement following operations on the circular 
// linked list. 
// • Insert a node at the front of the linked list. 
// • Delete a node from specified position. 
// • Insert a node at the end of the linked list. 
// • Display all nodes.

#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node* head = NULL;
struct Node* tail = NULL;

void insertAtHead(int n){

    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));

    newNode->data = n;

    if(head==NULL){
        head = tail = newNode ;
        tail->next = head;
    }

    else{
        newNode->next = head;
        head = newNode;
        tail->next = head; 
    }
}

void insertAtTail(int n){

    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));

    newNode->data = n;

    if(head==NULL){
        head = tail = newNode ;
        tail->next = head;
    }

    else{
        newNode->next = head;
        tail->next = newNode; 
        tail = newNode;
    }

}

void display()
{

    struct Node *curr = head;

    if (curr == NULL)
    {
        printf("List Is Empty\n");
        return;
    }

    do{
       
        printf("%d -> ", curr->data);
        curr = curr->next;
    }
    while (curr != head);

    printf("%d\n",head->data);

   
}

void deleteAtStart()
{

    if (head == NULL){              // No Element
        printf("List Is Empty");
        return;
    }

    else if(head == tail){              // Only For One Element
        head = tail = NULL;
        free(head);
    }

    struct Node* temp = head;           // For Two Elements
    
    head = head->next;
    tail->next = head;

    free(temp);
}



void deleteNodeFromPosition(int n) {
    if (head == NULL) {
        printf("List Is Empty\n");
        return;
    }

    if (n < 1) {
        printf("Invalid position\n");
        return;
    }

    // Count nodes
    int nodeCount = 0;
    struct Node* temp = head;
    do {
        nodeCount++;
        temp = temp->next;
    } while (temp != head);

    if (n > nodeCount) {
        printf("Out Of Bound\n");
        return;
    }

    // Delete head
    if (n == 1) {
        deleteAtStart();
        return;
    }

    struct Node* curr = head;
    for (int i = 1; i < n - 1; i++) {
        curr = curr->next;
    }

    struct Node* delNode = curr->next;
    curr->next = delNode->next;

    if (delNode == tail) {
        tail = curr;
        tail->next = head;
    }

    free(delNode);
}



void main(){

    int choice, value, position;
    
        printf("\nMenu:\n");
        printf("1. Insert at front\n");
        printf("2. Display all nodes\n");
      
        printf("3. Insert at end\n");
       
        printf("4. Delete node at specified position\n");
      
        printf("5. Exit\n");

    while (1) {
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert at front: ");
                scanf("%d", &value);
                insertAtHead(value);
                break;
            case 2:
                display();
                break;
           
            case 3:
                printf("Enter value to insert at end: ");
                scanf("%d", &value);
                insertAtTail(value);
                break;
           
            case 4:
                printf("Enter position to delete node: ");
                scanf("%d", &position);
                deleteNodeFromPosition(position);
                break;
          
            case 5:
                return;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
}