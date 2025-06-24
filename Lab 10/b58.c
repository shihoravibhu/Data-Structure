// 58. WAP to check whether 2 singly linked lists are same or not.

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

// struct Node *head = NULL;

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

void compare(struct Node *head1, struct Node *head2)
{

    struct Node *curr1 = head1;
    struct Node *curr2 = head2;

    int issame = 0;

    while (curr1->next != NULL && curr2->next != NULL)
    {

        if (curr1->data != curr2->data)
        {
            issame = 1;
            break;
        }

        curr1 = curr1->next;
        curr2 = curr2->next;
    }

    if (curr1->next == NULL && curr2->next == NULL && issame == 0)
    {

        printf("Linked List Is Same\n");
    }

    else
    {

        printf("Linked List Is Not Same\n");
    }
}

void main()
{

    struct Node *h1 = NULL;
    struct Node *h2 = NULL;

    h1 = insertAtFirst(h1, 9);
    h1 = insertAtFirst(h1, 8);
    h1 = insertAtFirst(h1, 7);
    h1 = insertAtFirst(h1, 6);

    h2 = insertAtFirst(h2, 9);
    h2 = insertAtFirst(h2, 8);
    h2 = insertAtFirst(h2, 7);
    h2 = insertAtFirst(h2, 6);

    display(h1);
    display(h2);

    compare(h1, h2);
}