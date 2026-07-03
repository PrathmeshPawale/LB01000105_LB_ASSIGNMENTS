// Ques : Accept number and position from user and off its 23rd bit if on or let it be same if already off
// Static mask will be used
// Without function
#include<stdio.h>

typedef unsigned int UINT;
int main()
{
    UINT iNo = 0;
    UINT iMask = 0xFFBFFFFF;

    printf("Enter Number : \n");
    scanf("%d",&iNo);

    iNo = iNo & iMask;

    printf("Updated Number : %d\n",iNo);

    return 0;
}