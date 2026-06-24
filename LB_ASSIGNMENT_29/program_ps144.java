// ------------------------------------------------------------
// Problem Statement:
// Accept Character from user and check whether it is small
// case or not (a-z).
//
// Input : g
// Output : TRUE
//
// Input : D
// Output : FALSE
// ------------------------------------------------------------

import java.util.*;

class CharacterX
{
    public boolean ChkSmall(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        boolean bRet = false;

        System.out.println("Enter the character :");

        cValue = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();

        bRet = cobj.ChkSmall(cValue);

        if(bRet == true)
        {
            System.out.println("It is Small case Character");
        }
        else
        {
            System.out.println("It is not a Small case Character");
        }
    }
}