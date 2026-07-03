// Input : 8
// Output : 1   2   3   4
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt < iNo  ; iCnt = iCnt + 1)    // Ajun eik option iCnt += 1 but it is not recommended and short hand operator is not a good programming practice
    {
        printf("%d\t", iCnt);
    }
}
int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}