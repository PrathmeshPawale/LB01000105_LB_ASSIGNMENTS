// Que 1(Bitwise operator) : Accept a number from user and check whether 7th bit of that number is on or off
// Static approach 7 rd bit out off 32
#include<stdio.h>

typedef unsigned int UINT;              // typedef( type define)
int main()
{
    UINT iNo = 0;
    UINT iAns = 0;
    UINT iMask = 0X40;                  // 1248 madhla third posi we want so set to 4

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("7th bit is ON\n");
    }
    else
    {
        printf("7th bit is OFF\n");
    }
    return 0;
}
