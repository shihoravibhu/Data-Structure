#include <stdio.h>

void main()
{

    int n, num1, num2, flag = 0;

    printf("Enter size of Array :");
    scanf("%d", &n);

    int a[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter Number : a[%d] : ", i);
        scanf("%d", &a[i]);
    }

    printf("Enter num1 : ");
    scanf("%d", &num1);

    printf("Enter num2 : ");
    scanf("%d", &num2);

    for (int i = 0; i < n; i++)
    {

        if (a[i] == num1)
        {
            int temp = a[i];
            a[i] = num2;
            flag = 1;
        }
    }

    if (flag == 0)
    {
        printf("Enter Valid Number");
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
}
