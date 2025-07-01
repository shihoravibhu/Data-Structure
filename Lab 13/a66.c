// 66. Write a program to sort elements of a linked list.

#include<stdio.h>
#include<stdlib.h>

struct Node {
    int data;
    struct Node* next;
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

void sortArray(struct Node* head){

    for(struct Node* i=head ; i->next!=NULL ; i=i->next){
        for(struct Node* j=head ; j->next!= NULL ; j=j->next){

            if(j->data > j->next->data){
                int temp = j->data;
                j->data = j->next->data;
                j->next->data = temp;
            }
        }
    }

}

void main (){

   struct Node *h1 = NULL;   

    h1 = insertAtFirst(h1, 1);
    h1 = insertAtFirst(h1, 3);
    h1 = insertAtFirst(h1, 9);
    h1 = insertAtFirst(h1, 7);
    h1 = insertAtFirst(h1, 99);    
    h1 = insertAtFirst(h1, 10);

    display(h1);    
    
    sortArray(h1);

    display(h1);

}