// 54. WAP to check whether the string is Palindrome or not using Pointer. 

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void main(){
    
    char *str = (char *) malloc(100 * sizeof(char));

    printf("Enter String :");
    scanf(" %[^\n]s", str);

    if (str == NULL)
    {

        printf("Mamory Allocation Failed\n");
    }

    else
    {

        char *revstr = (char *) malloc(100 * sizeof(char));

        int j=0 ;

        for(int i = strlen(str)-1 ; i > -1 ; i--){

            revstr[j] = str[i];

            j++;
            
        }

        if(strcmp(revstr,str) == 0){
            printf("Palindrome");
        }
        
        else{
            
            printf("Not Palindrome");
        }
        free(str);
        free(revstr);
    }
}