// Ques : Accept number and position from user and toggle the  bit at that position
// Dynamic mask will be used
//  Using function and adding filter of not accepting position invalid(>32 <0)
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0x1;
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

    iRet = ToggleBit(iValue, iLocation);

    printf("Updated number is : %d\n",iRet);

    return 0;
}