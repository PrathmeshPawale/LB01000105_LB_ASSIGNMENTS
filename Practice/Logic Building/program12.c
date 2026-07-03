// Accept the number from user and check whether the number is even or odd(Better approach)

#include<stdio.h>

void Check_Even_Odd(int iNo)
{
    int iRemainder = 0;

    iRemainder = iNo % 2;

    if(iRemainder == 0)
    {
        printf("Number is Even");
    }
    else 
    {
        printf("Number is Odd");
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    Check_Even_Odd(iValue);
    
    return 0;
}