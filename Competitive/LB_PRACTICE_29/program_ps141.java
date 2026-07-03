// ------------------------------------------------------------
// Problem Statement:
// Accept Character from user and check whether it is alphabet
// or not (A-Z a-z).
//
// Input : F
// Output : TRUE
//
// Input : &
// Output : FALSE
// ------------------------------------------------------------

import java.util.*;

class CharacterX
{
    public boolean ChkAlpha(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') ||
           (ch >= 'a' && ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program_ps141
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character :");
        cValue = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();

        bRet = cobj.ChkAlpha(cValue);

        if(bRet == true)
        {
            System.out.println("It is Character");
        }
        else
        {
            System.out.println("It is not Character");
        }
    }
}