// Practice program to understand swap
#include<stdio.h>

// Call by value ... perfform zala nahi swap
void Swap(int No1, int No2)
{
    int temp = 0;

    temp = No1;
    No1 = No2;
    No2 = temp;
}
int main()
{
    int i = 11;
    int j = 21;

    Swap(i,j);

    printf("%d",i);
    printf("%d",j);

    return 0;
}