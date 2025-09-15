// 57. Write a menu driven program to implement following operations on the singly
// linked list.
// • Insert a node at the front of the linked list.
// • Display all nodes.
// • Delete a first node of the linked list.
// • Insert a node at the end of the linked list.
// • Delete a last node of the linked list.
// • Delete a node from specified position.
// • count the number of nodes

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *head = NULL;

void insertAtFirst(int x)
{

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    
    newNode->data = x;
    newNode->next = head;

    head = newNode;

}

void insertAtLast(int x)
{

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    newNode->data = x;
    newNode->next = NULL;

    if (head == NULL)
    {
        head = newNode;
        return;
    }

    struct Node *curr = head;

    while (curr->next != NULL)
    {

        curr = curr->next;
    }

    curr->next = newNode;
}

void display()
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

void deleteAtStart()
{

    if (head == NULL)
    {
        printf("List Is Empty");
        return;
    }

    struct Node* temp = head;
    
    head = head->next;

    free(temp);
}

void deleteAtEnd(){
    
    if (head == NULL)
    {
        printf("List Is Empty");
        return;
    }

     // If only one node
    if (head->next == NULL) {
        free(head);
        head = NULL;
        return;
    }

    struct Node* curr = head;

     // Traverse to the second last node
    while(curr->next->next != NULL){

        curr = curr->next;
    }

    struct Node* temp = curr->next;
    curr->next = NULL;
    free(temp);

}

void deleteNodeFromPosition(int n){

    struct Node* curr = head;

    if (head == NULL)
    {
        printf("List Is Empty");
        
        return;
    }

    if (n < 1) {
        printf("Invalid position\n");
        return;
    }

    if(n==1){  // First Node Ne Delete Karva
        struct Node* temp = head;
        head = head->next;
        free(temp);
       
        return;
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

    free(temp2);
}

int countNodes()
{

    int count = 0 ;
    struct Node *curr = head;

    if (curr == NULL)
    {
        printf("List Is Empty");
        return 0;
    }

    while (curr != NULL)
    {
        curr = curr->next;
        count++;
    }

    return count ;

}

void main(){

    int choice, value, position;
    
        printf("\nMenu:\n");
        printf("1. Insert at front\n");
        printf("2. Display all nodes\n");
        printf("3. Delete first node\n");
        printf("4. Insert at end\n");
        printf("5. Delete last node\n");
        printf("6. Delete node at specified position\n");
        printf("7. Count nodes\n");
        printf("8. Exit\n");

    while (1) {
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert at front: ");
                scanf("%d", &value);
                insertAtFirst(value);
                break;
            case 2:
                display();
                break;
            case 3:
                deleteAtStart();
                break;
            case 4:
                printf("Enter value to insert at end: ");
                scanf("%d", &value);
                insertAtLast(value);
                break;
            case 5:
                deleteAtEnd();
                break;
            case 6:
                printf("Enter position to delete node: ");
                scanf("%d", &position);
                deleteNodeFromPosition(position);
                break;
            case 7:
                printf("Number of nodes: %d\n", countNodes());
                break;
            case 8:
                return;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
}


// #include <stdio.h>
// #include <stdlib.h>

// struct Node {
//     int data;
//     struct Node *next;
// };

// struct Node* insertAtFirst(struct Node *head, int x) {
//     struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
//     newNode->data = x;
//     newNode->next = head;
//     return newNode;   // new head
// }

// struct Node* insertAtLast(struct Node *head, int x) {
//     struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
//     newNode->data = x;
//     newNode->next = NULL;

//     if (head == NULL) {
//         return newNode;   // new node is head
//     }

//     struct Node *curr = head;
//     while (curr->next != NULL) {
//         curr = curr->next;
//     }
//     curr->next = newNode;
//     return head;
// }

// void display(struct Node *head) {
//     if (head == NULL) {
//         printf("List is empty\n");
//         return;
//     }
//     while (head != NULL) {
//         printf("%d -> ", head->data);
//         head = head->next;
//     }
//     printf("NULL\n");
// }

// struct Node* deleteAtStart(struct Node *head) {
//     if (head == NULL) {
//         printf("List is empty\n");
//         return NULL;
//     }
//     struct Node *temp = head;
//     head = head->next;
//     free(temp);
//     return head;
// }

// struct Node* deleteAtEnd(struct Node *head) {
//     if (head == NULL) {
//         printf("List is empty\n");
//         return NULL;
//     }
//     if (head->next == NULL) {
//         free(head);
//         return NULL;
//     }
//     struct Node *curr = head;
//     while (curr->next->next != NULL) {
//         curr = curr->next;
//     }
//     free(curr->next);
//     curr->next = NULL;
//     return head;
// }

// struct Node* deleteNodeFromPosition(struct Node *head, int n) {
//     if (head == NULL) {
//         printf("List is empty\n");
//         return NULL;
//     }
//     if (n < 1) {
//         printf("Invalid position\n");
//         return head;
//     }
//     if (n == 1) {
//         struct Node *temp = head;
//         head = head->next;
//         free(temp);
//         return head;
//     }

//     struct Node *curr = head;
//     for (int i = 1; curr != NULL && i < n - 1; i++) {
//         curr = curr->next;
//     }

//     if (curr == NULL || curr->next == NULL) {
//         printf("Position out of range\n");
//         return head;
//     }

//     struct Node *temp = curr->next;
//     curr->next = curr->next->next;
//     free(temp);
//     return head;
// }

// int countNodes(struct Node *head) {
//     int count = 0;
//     while (head != NULL) {
//         head = head->next;
//         count++;
//     }
//     return count;
// }

// int main() {
//     struct Node *head = NULL;
//     int choice, value, position;

//     printf("\nMenu:\n");
//     printf("1. Insert at front\n");
//     printf("2. Display all nodes\n");
//     printf("3. Delete first node\n");
//     printf("4. Insert at end\n");
//     printf("5. Delete last node\n");
//     printf("6. Delete node at specified position\n");
//     printf("7. Count nodes\n");
//     printf("8. Exit\n");

//     while (1) {
//         printf("Enter choice: ");
//         scanf("%d", &choice);

//         switch (choice) {
//             case 1:
//                 printf("Enter value to insert at front: ");
//                 scanf("%d", &value);
//                 head = insertAtFirst(head, value);
//                 break;
//             case 2:
//                 display(head);
//                 break;
//             case 3:
//                 head = deleteAtStart(head);
//                 break;
//             case 4:
//                 printf("Enter value to insert at end: ");
//                 scanf("%d", &value);
//                 head = insertAtLast(head, value);
//                 break;
//             case 5:
//                 head = deleteAtEnd(head);
//                 break;
//             case 6:
//                 printf("Enter position to delete node: ");
//                 scanf("%d", &position);
//                 head = deleteNodeFromPosition(head, position);
//                 break;
//             case 7:
//                 printf("Number of nodes: %d\n", countNodes(head));
//                 break;
//             case 8:
//                 return 0;
//             default:
//                 printf("Invalid choice. Please try again.\n");
//         }
//     }
// }
