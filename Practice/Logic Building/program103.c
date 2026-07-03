// Call by Address demonstration program.
#include<stdio.h>

void CallByAddress(int *iPtr)
{
    (*iPtr)++;
}
int main()
{
    int iValue = 11;

    CallByAddress(&iValue);            //   O/P : 12

    printf("Value after function call : %d\n",iValue);

    return 0;
}