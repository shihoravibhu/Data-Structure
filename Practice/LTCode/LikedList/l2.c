#include <stddef.h>



struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *reverseKGroup(struct ListNode *head, int k)
{

    struct ListNode *temp = head;
    int count = 0;

    while (count < k)
    {

        if (temp == NULL)
        {
            return head;
        }

        temp = temp->next;
        count++;
    }

    struct ListNode *prev = reverseKGroup(temp, k);

    temp = head, count = 0;

    while (count < k)
    {

        struct ListNode *next = temp->next;
        temp->next = prev;

        prev = temp;
        temp = next;

        count++;
    }
    return prev;
}