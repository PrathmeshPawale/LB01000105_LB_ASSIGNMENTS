//Printing string from i/p taken from user 
#include<stdio.h>

int strlenX(char *str)
{
    *str = 'A'; // str can be changed

}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter string :");
    scanf("%[^'\n']s",Arr);      


    strlenX(Arr);

    printf("String is : %s\n",Arr);     // it cant be changed again

    return 0;

}