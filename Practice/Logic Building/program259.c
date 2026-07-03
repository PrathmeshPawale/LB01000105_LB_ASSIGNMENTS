//Accept string from user and replace the letter l with -
#include<stdio.h>

void Update(char *str)       
{
    while(*str != '\0')
    {
        if(*str == 'l')        
        {
            *str == 'L';
        }
        str++;      // str = str + 1
    }
}
int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string :");
    scanf("%[^'\n']s",Arr);      

    Update(Arr);

    printf("Updated String is : %s\n",Arr);

    return 0;
}