#include <stdio.h>

void main()
{

    int a[6];

    for (int i = 0; i < 5; i++)
    {

        printf("Enter Element a[%d] :", i);
        scanf("%d", &a[i]);
    }

    int n, temp = 0;

    printf("Enter Element : ");
    scanf("%d", &n);

    for (int i = 0; i < 6; i++)
    {

        if (a[i] > n)
        {
            temp = a[i];
            a[i] = n;
            n = temp;
        }
    }

    for (int i = 0; i < 6; i++)
    {
        printf("%d ", a[i]);
    }


    // char ch[10] ;
    // scanf("%s",&ch);
    // printf("%s",ch);
}