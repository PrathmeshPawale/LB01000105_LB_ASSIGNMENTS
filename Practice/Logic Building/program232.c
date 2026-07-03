// Garbage will not coe due to \0 as it gets find
#include<stdio.h>

int main()
{
    char str[] = {'J','a','y',' ','g','a','n','e','s','h','\0'};

    printf("%s\n",str);

    return 0;
}