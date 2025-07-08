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

void split()
{

    if (head == tail || head->next == head)
    {
        return;
    }

    struct Node *slow = head;
    struct Node *fast = head;

    while (fast->next != NULL && fast->next->next != NULL)
    {

        slow = slow->next;
        fast = fast->next->next;
    }

    struct Node *secNode = slow->next;
    slow->next = head;

    struct Node *curr = secNode;

    while (curr->next != head)
    {
        curr = curr->next;
    }

    curr->next = secNode;

    return secNode;
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