// Que 1(Bitwise operator) : Accept a number from user and check whether 13th bit of that number is on or off
// Static approach 17th bit out off 32
// Here create mask manually...use hexadecimal value to ease up things
// 0X00010000 ( In this 0's prior to 1 does'nt matter but 0's after 1 matters this prog demonstrate the same)
#include<stdio.h>

typedef unsigned int UINT;              // typedef( type define)
int main()
{
    UINT iNo = 0;
    UINT iAns = 0;
    UINT iMask = 0X1000;                  

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("13th bit is ON\n");
    }
    else
    {
        printf("13th bit is OFF\n");
    }
    return 0;
}
