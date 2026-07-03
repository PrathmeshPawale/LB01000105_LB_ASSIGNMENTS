// Amusement Park Ticket (Final approach)


#include<stdio.h>

// User defined MACRO
#define AGE_INVALID -1

int Calculate_Ticket_Price(int iAge)        // helper function : * There should not be any user interaction in the helper function(printf and scanf)
{   
    // Input Filter
    if(iAge < 0)
    {
        return AGE_INVALID;
    }
    
    if(iAge >=0 && iAge<=5)
    {
        return 0;
    }
    else if(iAge >=6 && iAge <=18)
    {
        return 500;
    }
    else if(iAge >=19 && iAge <=50)
    {
        return 900;
    }
    else
    {
        return 400;
    }
}
int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Please Enter your Age to calculate Ticket price : ");
    scanf("%d",&iValue);

    iRet = Calculate_Ticket_Price(iValue);

    if(iRet == AGE_INVALID)
    {
        printf("Please enter positive Age \n");
    }
    else
    {
        printf("Your ticket price will be : %d rupees",iRet);
    }

    return 0;
}