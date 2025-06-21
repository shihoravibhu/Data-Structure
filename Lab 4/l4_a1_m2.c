// 24. Write a program to insert a number at a given location in an array. 

#include <stdio.h>

void main()
{

    int a[6];

    for (int i = 0; i < 5; i++)
    {

        printf("Enter Element a[%d] :", i);
        scanf("%d", &a[i]);
    }

    int idx, n;
    printf("Enter Location Index : ");
    scanf("%d", &idx);

    printf("Enter Insert Element : ");
    scanf("%d", &n);

    int temp = 0;
    

    for(int i=0 ; i<6 ; i++){
        if(i>=idx){
            temp = a[i];
            a[i] = n;
            n = temp;
        }
        
    }

    for (int i = 0; i < 6; i++)
    {
        printf("%d ", a[i]);
    }
}