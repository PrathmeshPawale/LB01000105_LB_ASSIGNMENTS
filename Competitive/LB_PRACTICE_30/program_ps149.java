// ------------------------------------------------------------
// Problem Statement:
//
// Accept Character from user and check whether
// it is special symbol or not.
//
// (!,@,#,$,%,^,&,*)
// ------------------------------------------------------------

import java.util.*;

class CharacterX
{
    public boolean ChkSpecial(char ch)
    {
        if((ch >= 33 && ch <= 47) ||
           (ch >= 58 && ch <= 64) ||
           (ch >= 91 && ch <= 96) ||
           (ch >= 123 && ch <= 126))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program_ps149
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        boolean bRet = false;

        System.out.println("Enter the character :");

        cValue = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();

        bRet = cobj.ChkSpecial(cValue);

        if(bRet == true)
        {
            System.out.println("It is Special Character");
        }
        else
        {
            System.out.println("It is not a Special Character");
        }
    }
}