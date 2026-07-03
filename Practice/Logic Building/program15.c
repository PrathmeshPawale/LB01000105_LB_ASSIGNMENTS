// Accept the number from user and check whether the number is even or odd(Better approach)


#include<stdio.h>
#include<stdbool.h>

bool Check_Even_Odd(int iNo)
{
    int iRemainder = 0;

    iRemainder = iNo % 2;

    if(iRemainder == 0)
    {
        return true;
    }
    else 
    {
        return false;
    }
}

int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter Number to check whether it is Even or Odd : ");
    scanf("%d",&iValue);

    bRet = Check_Even_Odd(iValue);

    if(bRet == true)
    {
        printf("%d is Even",iValue);
    }
    else 
    {
        printf("%d is Odd",iValue);
    }
    return 0;
}