// ------------------------------------------------------------
// Problem Statement:
// Accept Character from user and check whether it is digit
// or not (0-9).
//
// Input : 7
// Output : TRUE
//
// Input : d
// Output : FALSE
// ------------------------------------------------------------

import java.util.*;

class CharacterX
{
    public boolean ChkDigit(char ch)
    {
        if(ch >= '0' && ch <= '9')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program_ps143
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character :");

        cValue = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();

        bRet = cobj.ChkDigit(cValue);

        if(bRet == true)
        {
            System.out.println("It is Digit");
        }
        else
        {
            System.out.println("It is not a Digit");
        }
    }
}