// 46. Write a menu driven program to implement following operations on the Queue
// using an Array
// • ENQUEUE
// • DEQUEUE
// • DISPLAY

#include <stdio.h>

#define MAX 100

int queue[MAX];
int front = -1, rear = -1;

void enqueue(int val)
{

    if (rear >= MAX - 1)
    {
        printf("Queue Is OverFlow.\n");
        return;
    }

    if (front == -1)
    {
        front = 0;
    }

    queue[++rear] = val;
    printf("%d Is Enqueued.\n", val);
}

void dequeue()
{

    if (front == -1)
    {
        printf("Queue Is UnderFlow.\n");
        return;
    }

    printf("%d Is Dequeued.\n", queue[front++]);

    /* This condition `if(front > rear)` is checking if the front pointer has crossed the rear pointer
    in the queue. If this condition is true, it means that all elements in the queue have been
    dequeued, so it resets the front and rear pointers to -1, indicating an empty queue. This step is
    necessary to maintain the correct state of the queue after dequeuing elements. */
    if (front > rear)
    {
        front = rear = -1;
    }
}

void display()
{
    if (front == -1)
    {
        printf("Queue is Empty.\n");
        return;
    }
    for (int i = front; i <= rear; i++)
    {
        printf("%d ", queue[i]);
    }
    printf("\n");
}

void main()
{

    int choice, val;
    while (1)
    {
    
        printf("1. ENQUEUE\n");
        printf("2. DEQUEUE\n");
        printf("3. DISPLAY\n");
        printf("4. EXIT\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("Enter value to Enqueue: ");
            scanf("%d", &val);
            enqueue(val);
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        case 4:
            printf("Exiting..!\n");
            return;
        default:
            printf("Invalid Choice!\n");
        }
    }
}