// 23. WAP to sort the N names in an alphabetical order.

#include <stdio.h>
#include <string.h>
#include <ctype.h>

void main()
{

    int n;
    printf("Enter Total Number Of Name : \n");
    scanf("%d", &n);

    char names[n][50];

    for (int i = 0; i < n; i++)
    {
        printf("Enter Name %d : ", (i + 1));
        scanf(" %[^\n]s", names[i]);
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            
            // if ((int)names[i][0] > (int)names[j][0])
            if(strcasecmp(names[i],names[j]) > 0)
            {
                char temp[50] ;
                
                strcpy(temp,names[j]);                
                strcpy(names[j],names[i]);
                strcpy(names[i],temp);
                
            }
        }
    }

    printf("After Accesnding Order :\n");

    for(int i=0 ; i<n ; i++){
        printf("%s\n",names[i]);
    }
}