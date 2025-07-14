#include<stdio.h>
#include<stdlib.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *removeElements(struct ListNode *head, int val)
{

    while (head != NULL && head->val == val)
    {
        struct ListNode *temp = head;
        head = head->next;

        free(temp);
    }

    struct ListNode *curr = head;

    while (curr != NULL && curr->next != NULL)
    {

        if (curr->next->val == val)
        {
            struct ListNode *temp = curr->next;
            curr->next = curr->next->next;
            free(temp);
        }
        else
        {

            curr = curr->next;
        }
    }

    return head;
}

void main()
{
}