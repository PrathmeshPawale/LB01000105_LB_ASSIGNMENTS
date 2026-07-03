// Write a simple C program to perform addition of two floats
/*
    Algorithm : Addition of 2 nos

    START
        Accept first number as No1
        Accept Second number as No2
        Perform Addition of No1 and No2 
        Display the result
    STOP
*/

#include<stdio.h>

int main()
{
    float i,j,k;

    printf("Enter First Number : \n");
    scanf("%f",&i);

    printf("Enter Second Number : \n");
    scanf("%f",&j);

    k = i + j;

    printf("Addition is : %f\n",k);

    return 0;
}