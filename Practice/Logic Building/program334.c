// Ques : Accept number and position from user and toggle the  bit at that position
// Static mask will be used
//  Using function
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0x1;
    UINT iResult = 0;

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