// Ques : Demonstrate toggling bit of 2 positions 
// Using dynamic mask approach pretesting
// Without function
#include<stdio.h>

typedef unsigned int UINT;

// Posi : 3 and 8
int main()
{
    UINT iMask = 0x00000084;
    UINT iNo = 0;
    UINT iResult = 0;

    printf("Enter Number : \n");
    scanf("%d",&iNo);

    iResult = iNo ^ iMask ;

    printf("Updated number is : %d\n",iResult);

    return 0;
}