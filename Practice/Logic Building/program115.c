#include<stdio.h>
void Display(int Arr[], int iSize)      // * : dereference operator ,   [] : subscript operator  (terminologies)
{   
    int iCnt = 0;
    for(iCnt = 0;iCnt < iSize; iCnt++)
    {
        printf("%d\n",Arr[iCnt]);
    }
}

int main()
{
    int iLength = 4;

    int Brr[iLength] = {10,20,30,40};           // Error : variable-sized object may not be initialized

    Display(Brr, iLength);

    return 0;
}