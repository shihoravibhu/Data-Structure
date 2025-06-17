// 53. WAP to sort the array elements using Pointer.
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

        
        
        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i ;
            for(int j=i+1 ; j<n ; j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j ;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp ;
        }

        for(int i=0 ; i<n ; i++){
            printf("%d ",arr[i]);
        }
        free(arr);
    }

}