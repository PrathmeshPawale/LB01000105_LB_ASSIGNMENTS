// Ques : Accept number and position from user and off its 4th bit if on or let it be same if already off
// Static mask will be used  Position : 4
//  Using function and adding filter of not accepting position invalid(>32 <0)
// This code remanins incomplete : completed in program340
#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0xFFFFFFF7;
    UINT iResult = 0;

    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;
    }
    iMask = iMask << (iPos - 1);

    iResult = iNo ^ iMask;

    return iResult;
}
int main()
{
    UINT iValue = 0, iRet = 0, iLocation = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    printf("Enter the bit Position : \n");
    scanf("%d",&iLocation);

    iRet = OffBit(iValue, iLocation);

    printf("Updated number is : %d\n",iRet);

    return 0;
}