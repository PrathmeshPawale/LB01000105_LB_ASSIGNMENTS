// Write a program which accept number from user and display its table in reverse order.

// Input  : 2
// Output : 20 18 16 14 12 10 8 6 4 2

// Input  : 5
// Output : 50 45 40 35 30 25 20 15 10 5

// Input  : -5
// Output : 50 45 40 35 30 25 20 15 10 5

// Time Complexity : O(10) = O(1)

#include<stdio.h>

void TableRev(int iNo)
{
    int i = 0;

    // Logic

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(i = 10; i >= 1; i--)
    {
        printf("%d\t",iNo * i);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    TableRev(iValue);

    return 0;
}