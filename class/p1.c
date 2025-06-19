#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data ;
    struct Node * link;

};

struct Node *head = NULL;

void insertFirst(int data){

    struct Node *newNode ;
    newNode = (struct Node *) malloc(sizeof(struct Node));
    newNode -> link = NULL;
    newNode -> data = data;

    if(head==NULL){
        head = newNode ;
        return;
    }

    newNode -> link = head;
    head = newNode;

}

void print(){

    struct Node *curr = head ;

   

    while(curr != NULL){

        printf("%d ",curr->data);

        curr = curr -> link ;

    }
}

void freeList()
{
    struct Node *curr = head;
    while (curr != NULL)
    {
        struct Node *temp = curr;
        curr = curr->link;
        free(temp);
    }
}

void main()
{
   

    insertFirst(2);
    insertFirst(4);
    insertFirst(6);
    insertFirst(8);

    print();

    
     freeList();
    
}