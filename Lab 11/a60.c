// 60. Write a program to implement stack using singly linked list.

#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

// Push operation (insert at the beginning)
void push(struct Node** head, int x) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = x;
    newNode->next = *head;
    *head = newNode;
}

// Pop operation (remove from the beginning)
int pop(struct Node** head) {
    if (*head == NULL) {
        printf("Stack is empty!\n");
        return -1; // Return a default error value
    }

    struct Node* temp = *head;
    int popValue = temp->data;
    *head = (*head)->next;
    free(temp);
    return popValue;
}

int peek(struct Node** head) {
    if (*head == NULL) {
        printf("Stack is empty\n");
        return -1;
    }
    return (*head)->data;
}

// Display stack
void display(struct Node* head) {
    if (head == NULL) {
        printf("Stack is empty\n");
        return;
    }

    printf("Stack: ");
    while (head != NULL) {
        printf("%d -> ", head->data);
        head = head->next;
    }
    printf("NULL\n");
}


void main(){

    struct Node* head = NULL;

    push(&head, 10);
    push(&head, 20);
    push(&head, 30);
    display(head);

    printf("Popped: %d\n", pop(&head));
    display(head);

    printf("Popped: %d\n", pop(&head));
    display(head);

  
}
