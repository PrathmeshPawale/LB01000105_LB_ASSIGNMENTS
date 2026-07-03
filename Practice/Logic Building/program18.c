// Amusement Park Ticket (Better approach)


#include<stdio.h>

int Calculate_Ticket_Price(int iAge)        // helper function
{
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

    printf("Your Ticket price will be %d rupees\n",iRet);

    return 0;
}