// ------------------------------------------------------------
// Problem Statement:
//
// If capital then display all characters till Z.
//
// If small then display all characters in reverse
// order till a.
//
// Otherwise print directly.
// ------------------------------------------------------------

import java.util.*;

class CharacterX
{
    public void Display(char ch)
    {
        char c = '\0';

        if(ch >= 'A' && ch <= 'Z')
        {
            for(c = ch; c <= 'Z'; c++)
            {
                System.out.print(c + "\t");
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            for(c = ch; c >= 'a'; c--)
            {
                System.out.print(c + "\t");
            }
        }
        else
        {
            System.out.println(ch);
        }
    }
}

class program_ps148
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