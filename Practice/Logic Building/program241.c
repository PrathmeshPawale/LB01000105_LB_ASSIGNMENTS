//Printing string from i/p taken from user using regex
#include<stdio.h>

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string :");
    scanf("%[^'\n']s",Arr);       // Regex(%[^'\n']s) (regular operation) operator vaparla....issue resolved

    printf("Entered string is : %s\n",Arr);

    return 0;

}