// Ques : Accept number and position from user and off its 4th bit if on or let it be same if already off
// Dynamic posi input for mask also
#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0x1;
    UINT iResult = 0;

    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;
    }
    iMask = iMask << (iPos - 1);

    iMask = ~iMask;                 // Toggles i/p

    iResult = iNo & iMask;

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