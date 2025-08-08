// 62. WAP to remove duplicate elements from a singly linked list.
// (Pela List Ne Sort Ane Pachi Delete Duplicate)

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
// Bubble sort on linked list
void sortArray(struct Node **head)
{

    if (*head == NULL || (*head)->next == NULL)
    {
        return;
    }

    int swapped;
    struct Node **curr;

    do
    {
        swapped = 0;
        curr = head;

        while ((*curr)->next != NULL)
        {
            struct Node *first = *curr;
            struct Node *second = (*curr)->next;

            if (first->data > second->data)
            {
                first->next = second->next;
                second->next = first;

                *curr = second;

                swapped = 1;
            }

            curr = &((*curr)->next);
        }

    } while (swapped);
}
// Removes duplicate elements from sorted list
void removeDuplicates(struct Node *head)
{

    struct Node *curr = head;

    while (curr != NULL && curr->next != NULL)
    {

        if (curr->data == curr->next->data)
        {

            struct Node *temp = curr->next;
            curr->next = curr->next->next;
            free(temp);
        }

        else
        {

            curr = curr->next;
        }
    }
}

void main()
{

    struct Node *h1 = NULL;

    h1 = insertAtFirst(h1, 4);
    h1 = insertAtFirst(h1, 2);
    h1 = insertAtFirst(h1, 3);
    h1 = insertAtFirst(h1, 2);
    h1 = insertAtFirst(h1, 5);
    h1 = insertAtFirst(h1, 3);
    h1 = insertAtFirst(h1, 1);
    h1 = insertAtFirst(h1, 4);

    printf("Original List:\n");
    display(h1);

    sortArray(&h1);
    printf("\nSorted List:\n");
    display(h1);

    removeDuplicates(h1);
    printf("\nList After Removing Duplicates:\n");
    display(h1);
}