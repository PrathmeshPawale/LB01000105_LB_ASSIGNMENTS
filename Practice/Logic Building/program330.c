// Ques : Accept number from user and toggle 4th bit of that number
// Static mask will be used
#include<stdio.h>

typedef unsigned int UNIT;
int main()
{
    UNIT iNo = 0;
    UNIT iMask = 0;

    printf("Enter Number : \n");
    scanf("%d",&iNo);

    iMask = 0x00000008;

    iNo = iNo ^ iMask;

    printf("Updated Number : %d\n",iNo);

    return 0;
}