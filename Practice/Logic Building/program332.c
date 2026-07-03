// Ques : Accept number from user and toggle 28th bit of that number
// Static mask will be used
#include<stdio.h>

typedef unsigned int UNIT;
int main()
{
    UNIT iNo = 0;
    UNIT iMask = 0;

    printf("Enter Number : \n");
    scanf("%d",&iNo);

    iMask = 0x8000000;

    iNo = iNo ^ iMask;

    printf("Updated Number : %d\n",iNo);

    return 0;
}