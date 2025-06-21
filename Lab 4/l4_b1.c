// 27. Write a program to delete a number from an array that is already sorted in an 
// ascending order. 

#include <stdio.h>

void main()
{

    int a[5];

    for (int i = 0; i < 5; i++)
    {

        printf("Enter Element a[%d] :", i);
        scanf("%d", &a[i]);
    }

    int n, temp = 0;

    int idx,pos=0;

    printf("Enter Element : ");
    scanf("%d", &n);

    for (int i = 0; i < 5; i++) {

        if(a[i]==n) {
            pos = i ;
        }
    }

   
    for (int i = 0; i < 5; i++)
    {

       if(i>=pos){
        
        a[i]=a[i+1];
       }
    }

    for (int i = 0; i < 4; i++)
    {
        printf("%d ", a[i]);
    }
}