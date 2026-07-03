// ------------------------------------------------------------
// Problem Statement:
// Accept Character from user and check whether it is capital
// or not (A-Z).
//
// Input : F
// Output : TRUE
//
// Input : d
// Output : FALSE
// ------------------------------------------------------------

import java.util.*;

class CharacterX
{
    public boolean ChkCapital(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program_ps142
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character :");

        cValue = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();

        bRet = cobj.ChkCapital(cValue);

        if(bRet == true)
        {
            System.out.println("It is Capital Character");
        }
        else
        {
            System.out.println("It is not a Capital Character");
        }
    }
}