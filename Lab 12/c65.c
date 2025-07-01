// 65. WAP to swap Kth node from beginning with Kth node from end in a singly linked
// list.

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

struct Node *swap(int k, struct Node *head)
{

    if (head == NULL)
    {
        printf("List Is Empty");
        return NULL;
    }

    int count = 1;
    struct Node *curr = head;

    // Count the number of nodes
    int n = 0;
    struct Node *temp = head;
    while (temp != NULL)
    {
        n++;
        temp = temp->next;
    }

    // If k is more than number of nodes
    if (k > n)
    {
        printf("k is greater than the length of the list\n");
        return head;
    }

    // If kth node from start and end are the same node, no need to swap
    if (2 * k - 1 == n)
    {
        return head;
    }

    struct Node *curr_start = head;
    for (int i = 1; i < k - 1; i++)
    {
        curr_start = curr_start->next;
    }

    struct Node *curr_end = head;
    for (int i = 1; i < n - k; i++)
    {
        curr_end = curr_end->next;
    }

    // Swap Node

    struct Node *temp1 = (curr_start == NULL) ? head : curr_start->next;
    struct Node *temp2 = (curr_end == NULL) ? head : curr_end->next;
    struct Node *forw1 = temp1->next;
    struct Node *forw2 = temp2->next;

    temp1->next = forw2;
    temp2->next = forw1;

    if (curr_start != NULL)
    {
        curr_start->next = temp2;
    }
    else
    {
        head = temp2;
    }

    if (curr_end != NULL)
    {
        curr_end->next = temp1;
    }
    else
    {
        head = temp1;
    }
    return head;
}

void main()
{

    struct Node *h1 = NULL;

    h1 = insertAtFirst(h1, 11);
    h1 = insertAtFirst(h1, 9);
    h1 = insertAtFirst(h1, 7);
    h1 = insertAtFirst(h1, 5);
    h1 = insertAtFirst(h1, 3);
    h1 = insertAtFirst(h1, 1);
    // h1 = insertAtFirst(h1, 99);
    // h1 = insertAtFirst(h1, 10);

    display(h1);

    h1 = swap(5, h1);

    display(h1);
}