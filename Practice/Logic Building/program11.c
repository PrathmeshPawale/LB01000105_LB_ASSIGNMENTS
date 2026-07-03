// Accept the number from user and check whether the number is even or odd
/*ALGORITHM :
    Approach 1:
    START
        Accept number as No
        If No is completely divisilble by 2 
            then print Even
        Otherwise 
            print Odd
    STOP
    Approach 2:
    START
        Accept number as No
        Divide No by 2
        If remainder is 0
            then print as Even
        otherwise
            print Odd
    STOP
*/
#include<stdio.h>

int main()
{
    int iValue = 0;
    int iRemainder = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    iRemainder = iValue % 2;

    if(iRemainder == 0)
    {
        printf("Number is Even");
    }
    else 
    {
        printf("Number is Odd");
    }


    return 0;
}