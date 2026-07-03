// Accept the number from user and check whether the number is even or odd(Better approach)


#include<stdio.h>
#include<stdbool.h>

bool Check_Even_Odd(int iNo)
{
    if( (iNo % 2) == 0)
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

    if(bRet)
    {
        printf("%d is Even",iValue);
    }
    else 
    {
        printf("%d is Odd",iValue);
    }
    return 0;
}