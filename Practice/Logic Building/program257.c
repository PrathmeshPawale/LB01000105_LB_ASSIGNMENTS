//Accept string from user and count the number Spaces
#include<stdio.h>

int CountSpace(const char *str)       
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ' ')        
        {
            iCount++;
        }
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

    iRet = CountSpace(Arr);

    printf("Frequency of Capital alphabets is : %d\n",iRet);

    return 0;
}