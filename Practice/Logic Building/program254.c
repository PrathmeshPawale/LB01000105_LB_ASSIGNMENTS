//Accept string from user and count the number small characters
#include<stdio.h>

int CountSmall(const char *str)       
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str >= 97 && *str <=122)        // Bad prog practice to use ascii values
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

    iRet = CountSmall(Arr);

    printf("Frequency of small alphabets is : %d\n",iRet);

    return 0;
}