// Program to display (not convert) decimal to binary 
#include<stdio.h>

int main()
{
    int iNo = 0;
    int iDigit = 0;     // Ithe vaparla nhi

    printf("Enter number : \n");
    scanf("%d",&iNo);

    while(iNo != 0)
    {
        iDigit = iNo % 2;
        printf("%d",iDigit);
        iNo = iNo / 2;
    }

    printf("\n");


    return 0;
}