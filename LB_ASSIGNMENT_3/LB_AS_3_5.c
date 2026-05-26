// Accept one character from user and check whether the character is vowel (a,e,i,o,u) or not.
// Input : E    Output : TRUE
// Input : d    Output : FALSE

#include<stdio.h>
typedef int BOOL;

#define TRUE 1
#define FALSE 0
BOOL ChkVowel(char cValue)
{
    if((cValue == 'a') || (cValue == 'A') ||
       (cValue == 'e') || (cValue == 'E') ||
       (cValue == 'i') || (cValue == 'I') ||
       (cValue == 'o') || (cValue == 'O') ||
       (cValue == 'u') || (cValue == 'U'))
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}
int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter character : \n");
    scanf("%c",&cValue);

    bRet = ChkVowel(cValue);

    if(bRet == TRUE)
    {
        printf("It is a Vowel");
    }
    else
    {
        printf("It is not a Vowel");
    }
    return 0;
}