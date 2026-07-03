// Accept string from user and display output in reverse order
#include<stdio.h>

void ReverseDisplay(char *str)
{
    char *start = NULL;

    start = str;

    while(*str != '\0')
    {
        str++;
    }
    str--;                      // Soln of error in prev code
    while(start <= str)
    {
        printf("%c\n",*str);
        str--;
    }
}
int main()
{
    char Arr[50] = {"\0"};

    printf("Enter string : \n");
    scanf("%[^'\n']s", Arr);

    ReverseDisplay(Arr);

    return 0;
}