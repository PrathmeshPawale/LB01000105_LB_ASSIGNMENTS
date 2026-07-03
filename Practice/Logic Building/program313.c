// Que 1(Bitwise operator) : Accept a number from user and check whether 17th bit of that number is on or off
// Static approach 17th bit out off 32
// Here create mask manually...use hexadecimal value to ease up things
// best approach to use in hexadecimal instead of using decimal no of mask
#include<stdio.h>

typedef unsigned int UINT;              // typedef( type define)
int main()
{
    UINT iNo = 0;
    UINT iAns = 0;
    UINT iMask = 0X00010000;                  

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("17th bit is ON\n");
    }
    else
    {
        printf("17th bit is OFF\n");
    }
    return 0;
}
