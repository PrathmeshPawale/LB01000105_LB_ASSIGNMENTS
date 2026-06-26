// ------------------------------------------------------------
// Problem Statement:
// Accept character from user.
//
// If character is small display corresponding capital.
//
// If character is capital display corresponding small.
//
// Otherwise display as it is.
// ------------------------------------------------------------

import java.util.*;

class CharacterX
{
    public void Display(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println((char)(ch - 32));
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println((char)(ch + 32));
        }
        else
        {
            System.out.println(ch);
        }
    }
}

class program_ps147
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        System.out.println("Enter the character :");

        cValue = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();

        cobj.Display(cValue);
    }
}