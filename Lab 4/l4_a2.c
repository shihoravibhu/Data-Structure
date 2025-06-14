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

    int idx;

    printf("Enter Location Index : ");
    scanf("%d", &idx);

   
    for (int i = 0; i < 5; i++)
    {

       if(i>=idx){
        
        a[i]=a[i+1];
       }
    }

    for (int i = 0; i < 4; i++)
    {
        printf("%d ", a[i]);
    }
}