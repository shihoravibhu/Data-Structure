// 90. Write a program to implement Selection Sort using Array.

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

void selectionSort(int arr[], int size){ 

    for(int i=0 ; i<size-1 ; i++){
        int min = i;
        for(int j=i+1 ; j<size ; j++){

            if(arr[min] > arr[j]){
                int temp = arr[min];
                arr[min] = arr[j];
                arr[j] = temp;
            }
            
        }
    }
      
}

void main()
{
    int size;

    printf("Enter size of array: \n");
    scanf("%d", &size);

    int arr[size];

    printf("Enter elements of array : \n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
        
    selectionSort(arr, size);

    printf("Sorted Array: \n");
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    
}