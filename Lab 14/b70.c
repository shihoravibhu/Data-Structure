// 70. WAP to split a circular linked list into two halves.

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *head = NULL;
struct Node *tail = NULL;

void insertAtHead(int n)
{

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    newNode->data = n;

    if (head == NULL)
    {
        head = tail = newNode;
        tail->next = head;
    }

    else
    {
        newNode->next = head;
        head = newNode;
        tail->next = head;
    }
}

void insertAtTail(int n)
{

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

    newNode->data = n;

    if (head == NULL)
    {
        head = tail = newNode;
        tail->next = head;
    }

    else
    {
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

    do
    {

        printf("%d -> ", curr->data);
        curr = curr->next;
    } while (curr != head);

    printf("%d\n", head->data);
}

struct Node* split() {
    if (head == NULL || head->next == head) {
        printf("Not enough elements to split.\n");
        return NULL;
    }

    struct Node* slow = head;
    struct Node* fast = head;

    // Use slow-fast with CSLL condition
    while (fast->next != head && fast->next->next != head) {
        slow = slow->next;
        fast = fast->next->next;
    }

    struct Node* head2 = slow->next; // start of second half

    // Make first half circular
    slow->next = head;

    // Make second half circular
    struct Node* curr = head2;
    while (curr->next != head) {
        curr = curr->next;
    }
    curr->next = head2;

    return head2; // return the head of the second half
}


void main()
{

    insertAtHead(12);
    insertAtHead(6);
    insertAtHead(9);
    insertAtHead(18);
    insertAtHead(5);
    insertAtHead(25);

    display();

    display();
}