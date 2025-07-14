// 67. WAP to perform given operation in the linked list. There exist a Linked List. Add
// a node that contains the GCD of that two nodes between every pair adjacent
// node of Linked List.

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

int find_gcd(int a, int b)
{
    while (b != 0)
    {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

struct Node *gcd(struct Node *head)
{

    if (head == NULL || head->next == NULL)
    {
        printf("not safficient element.");

        return NULL;
    }

    struct Node *curr = head;

    while (curr != NULL && curr->next != NULL)
    {

        struct Node *temp = curr->next;
        int g = find_gcd(curr->data, temp->data);

        // Create new node for GCD
        struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));

        newnode->data = g;

        // Insert the new node between curr and temp
        curr->next = newnode;
        newnode->next = temp;

        // Move curr to the next original node
        // curr = temp;
        curr = curr->next;
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

    h1 = gcd(h1);

    display(h1);
}