// Que 1(Bitwise operator) : Accept a number from user and position of bit from user and check whether the bit at that specific position is on or off
// Dynamic Mask Design 
#include<stdio.h>

typedef unsigned int UINT;              
int main()
{
    UINT iNo = 0;
    UINT iAns = 0;
    UINT iMask = 0X1;       
    UINT iPos = 0;          

    printf("Enter number : \n");
    scanf("%d",&iNo);

    printf("Enter the position : \n");
    scanf("%d",&iPos);

    iMask = iMask << (iPos - 1);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("bit is ON\n");
    }
    else
    {
        printf("bit is OFF\n");
    }
    return 0;
}
