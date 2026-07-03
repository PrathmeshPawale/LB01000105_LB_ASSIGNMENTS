//Printing string from i/p taken from user 
#include<stdio.h>

int strlenX(const char *str)       
{
    int iCount = 0;

    while(*str != '\0')
    {
        iCount++;
        str++;      // str = str + 1
    }
    return iCount;
}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter string :");
    scanf("%[^'\n']s",Arr);      


    iRet = strlenX(Arr);

    printf("String length is : %d\n",iRet);

    return 0;

}