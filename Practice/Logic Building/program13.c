// Accept the number from user and check whether the number is even or odd(Better approach)


#include<stdio.h>

int Check_Even_Odd(int iNo)
{
    int iRemainder = 0;

    iRemainder = iNo % 2;

    return iRemainder;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    iRet = Check_Even_Odd(iValue);

    if(iRet == 0)
    {
        printf("Number is Even");
    }
    else 
    {
        printf("Number is Odd");
    }
    return 0;
}