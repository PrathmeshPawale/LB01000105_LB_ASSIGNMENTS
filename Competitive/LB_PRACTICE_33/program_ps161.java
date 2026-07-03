// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user and
// one character. Check whether that character is
// present in the string or not.
//
// Input  : Marvellous Multi OS
//          e
// Output : TRUE
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public boolean ChkChar(String str, char ch)
    {
        int i = 0;

        while(i < str.length())
        {
            if(str.charAt(i) == ch)
            {
                return true;
            }

            i++;
        }

        return false;
    }
}

class program_ps161
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";
        char cValue = '\0';

        boolean bRet = false;

        System.out.println("Enter string :");
        str = sobj.nextLine();

        System.out.println("Enter the character :");
        cValue = sobj.next().charAt(0);

        StringX xobj = new StringX();

        bRet = xobj.ChkChar(str,cValue);

        if(bRet == true)
        {
            System.out.println("Character found");
        }
        else
        {
            System.out.println("Character not found");
        }
    }
}