// Accept string from user and reverse it actually not to display
#include<stdio.h>

void strrevX(char *str)
{
    char *start = NULL;
    char *end = NULL;
    char temp = '\0';

    start = str;

    while(*str != '\0')
    {
        str++;
    }
    str--; 
    end = str;

    while(start < str)
    {
        temp = *start;
        *start = *end;
        *end = temp;
    }
    printf("\n");
}
int main()
{
    char Arr[50] = {"\0"};

    printf("Enter string : \n");
    scanf("%[^'\n']s", Arr);

    strrevX(Arr);

    printf("Updated string is :",strrevX);

    return 0;
}