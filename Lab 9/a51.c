// 51. WAP to calculate the sum of n numbers using Pointer. 

#include<stdio.h>
#include<stdlib.h>

void main(){

    int n;
    printf("Enter Size of Array : ");
    scanf("%d", &n);

    int *arr = (int *)malloc(n * sizeof(int));

    if (arr == NULL)
    {

        printf("Mamory Allocation Failed\n");
    }

    else
    {

        printf("Enter Elements");
        for (int i = 0; i < n; i++)
        {
            printf("Enter Elemnet arr[%d] :", i);
            scanf("%d", &arr[i]);
        }

        int sum = 0;
        int *ptr = arr;
        
        for (int i = 0; i < n; i++)
        {
            sum+= *(ptr+i);            
        }

        printf("sum of all Element : %d", sum);
        free(arr);
    }
}