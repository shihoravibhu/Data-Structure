// 61. Write a program to implement priority queue using singly linked list. (Ascending priority) 
// (smaller number = higher priority)

#include <stdio.h>
#include <stdlib.h>


struct Node {
    int data;
    int priority;
    struct Node* next;
};

// Create Node

struct Node* createNode(int data , int priority){

    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    
    newNode->data = data;
    newNode->priority = priority;
    
    return newNode;
}

// Enqueue operation (insert in sorted order of priority)

void enqueue(struct Node** head , int data , int priority){
    
    struct Node* newNode = createNode(data,priority);

    if(*head == NULL || newNode->priority < (*head)->priority){
        newNode->next = *head;
        *head = newNode;
    }
    else{
        struct Node* curr = *head;

        while(curr->next != NULL && newNode->priority >= curr->next->priority){
            curr = curr->next;
        }

        newNode->next = curr->next;
        curr->next = newNode;
    }
    
}

// Dequeue operation (removes highest priority node)

int dequeue(struct Node** head){

    if(head == NULL){
        printf("Priority Queue is empty!\n");
        return -1;
    }

    int val = (*head)->data;
    
    struct Node* temp = *head;
    *head = (*head)->next;
    free(temp);

    return val;
}


// Display the queue
void display(struct Node* head) {
    if (head == NULL) {
        printf("Priority Queue is empty.\n");
        return;
    }

    printf("Priority Queue (Data | Priority):\n");
    while (head != NULL) {
        printf("%d | %d --> ", head->data, head->priority);
        head = head->next;
    }
    printf("NULL\n");
}


void main() {
    struct Node* pq = NULL;

    enqueue(&pq, 30, 2);
    enqueue(&pq, 10, 1);
    enqueue(&pq, 50, 3);
    enqueue(&pq, 20, 0);

    display(pq);

    printf("Dequeued: %d\n", dequeue(&pq));
    display(pq);

   
}

// #include <stdio.h>
// #include <stdlib.h>

// struct Node {
//     int data;
//     struct Node* next;
// };

// // Enqueue (insert at last)
// void enqueue(struct Node** front, struct Node** rear, int x) {
//     struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
//     newNode->data = x;
//     newNode->next = NULL;

//     if (*rear == NULL) {   // queue empty
//         *front = *rear = newNode;
//         return;
//     }

//     (*rear)->next = newNode;
//     *rear = newNode;
// }

// // Dequeue (remove from front)
// int dequeue(struct Node** front, struct Node** rear) {
//     if (*front == NULL) {
//         printf("Queue is empty!\n");
//         return -1;
//     }

//     struct Node* temp = *front;
//     int value = temp->data;

//     *front = (*front)->next;
//     if (*front == NULL) {   // if queue became empty
//         *rear = NULL;
//     }

//     free(temp);
//     return value;
// }

// // Peek (see front element)
// int peek(struct Node* front) {
//     if (front == NULL) {
//         printf("Queue is empty!\n");
//         return -1;
//     }
//     return front->data;
// }

// // Display queue
// void display(struct Node* front) {
//     if (front == NULL) {
//         printf("Queue is empty\n");
//         return;
//     }

//     printf("Queue (front -> rear): ");
//     while (front != NULL) {
//         printf("%d -> ", front->data);
//         front = front->next;
//     }
//     printf("NULL\n");
// }

// int main() {
//     struct Node* front = NULL;
//     struct Node* rear = NULL;

//     enqueue(&front, &rear, 10);
//     enqueue(&front, &rear, 20);
//     enqueue(&front, &rear, 30);

//     display(front);

//     printf("Dequeued: %d\n", dequeue(&front, &rear));
//     display(front);

//     printf("Front element: %d\n", peek(front));

//     return 0;
// }


