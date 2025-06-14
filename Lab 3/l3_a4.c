#include<stdio.h>

void main(){

   int n  , maxpos , minpos;

    printf("Enter size of Array :");
    scanf("%d" ,&n);

    int a[n];

    for(int i=0 ; i<n ; i++){
        printf("Enter Number : a[%d] : " ,i);
        scanf("%d",&a[i]);
    }

    int max = a[0];
    int min = a[0];

    for(int i=0 ; i<n ; i++){
        if(a[i]>max){
            max = a[i];
            maxpos = i; 
        }
        if(a[i]<min){
            min = a[i];
            minpos = i ;
        }
    }

    printf("Maxpos : %d\n",maxpos);
    printf("Minpos : %d",minpos);



    
}