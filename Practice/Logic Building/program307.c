// Accept a number from user and count the no.of bits 1's in the number(without if condition count 1's)
#include<stdio.h>
int main()
{
    int iNo = 0, iCount = 0, iDigit = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    while(iNo != 0)
    {
        iDigit = iNo % 2;
        iCount = iCount + iDigit;
        iNo = iNo / 2;
    }
    printf("Number of 1's bit in the number are : %d", iCount);

    return 0;
}