// Que 1(Bitwise operator) : Accept a number from user and check whether 3rd bit of that number is on or off
// Static approach 3 rd bit out off 32
// using Unsigned int 
// We will be using mask designing from here onwards
// typedef of unsigned integer
#include<stdio.h>

typedef unsigned int UINT;              // typedef( type define)
int main()
{
    UINT iNo = 0;
    UINT iAns = 0;
    UINT iMask = 4;                  // 1248 madhla third posi we want so set to 4

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("3rd bit is ON\n");
    }
    else
    {
        printf("3rd bit is OFF\n");
    }
    return 0;
}
