// Call by Value demonstration program.
#include<stdio.h>

void CallByValue(int iNo)
{
    iNo++;
}
int main()
{
    int iValue = 11;

    CallByValue(iValue);            // CallByValue(11)   O/P : 11 yenar

    printf("Value after function call : %d\n",iValue);

    return 0;
}