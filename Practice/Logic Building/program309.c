// Que 1(Bitwise operator) : Accept a number from user and check whether 3rd bit of that number is on or off
// Static approach 3 rd bit out off 32
// using Unsigned int 
// We will be using mask designing from here onwards
#include<stdio.h>
int main()
{
    unsigned int iNo = 0;
    unsigned int iAns = 0;
    unsigned int iMask = 4;                  // 1248 madhla third posi we want so set to 4

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
