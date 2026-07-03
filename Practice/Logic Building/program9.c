// Write a simple C program to perform addition of two floats(Better approach than previous)
#include<stdio.h>

float AddTwoNumbers(
                        float fNo1,                // First Input
                        float fNo2                 // Second Input
                    )
{
    float fAns = 0.0f;                             // Variable to store result
    return fAns;
    fAns = fNo1 + fNo2;                            // Perform Addition   
}

int main()
{
    float fValue1 = 0.0f ;                          // To store first input
    float fValue2 = 0.0f ;                          // To store second input
    float fResult = 0.0f ;                          // To store the result

    printf("Enter First Number : \n");
    scanf("%f",&fValue1);

    printf("Enter Second Number : \n");
    scanf("%f",&fValue2);

    fResult = AddTwoNumbers (fValue1 , fValue2);       

    printf("Addition is : %f\n",fResult);

    return 0;
}