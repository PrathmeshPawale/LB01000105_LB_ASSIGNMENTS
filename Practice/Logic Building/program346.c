// Ques : Demonstrate toggling bit of 2 positions 
// Static mask will be used
// Without function
#include<stdio.h>

typedef unsigned int UINT;
int main()
{
    // Posi : 21 and 27
    UINT iMask = 0x04100000;
    UINT iNo = 0;
    UINT iResult = 0;

    printf("Enter Number : \n");
    scanf("%d",&iNo);

    iResult = iNo ^ iMask ;

    printf("Updated number is : %d\n",iResult);

    return 0;
}