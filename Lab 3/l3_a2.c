#include <stdio.h>

void main()
{

    int m, n, sum = 0;

    int temp;

    printf("Enter m Starting Point :");
    scanf("%d", &m);
    temp = m;

    printf("Enter n Ending Point :");
    scanf("%d", &n);

    int a[n - m + 1];

    for (int i = 0; i < (n - temp + 1); i++)
    {

        a[i] = m;

        m++;
    }

    for (int j = 0; j < (n - temp + 1); j++)
    {

        sum += a[j];
    }

    printf("sum : %d", sum);
}