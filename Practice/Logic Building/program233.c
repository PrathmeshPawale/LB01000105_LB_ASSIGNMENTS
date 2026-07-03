// Garbage will not coe due to \0 as it gets find

#include<stdio.h>

int main()
{
    char str[] = {'J','a','y','\0','g','a','n','e','s','h','\0'};       // Will display o/p till jay only as soon as it finds \0 it will stop and print output

    return 0;
}