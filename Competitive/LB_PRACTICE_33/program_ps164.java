// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user and
// one character. Return index of last occurrence.
//
// Input  : Marvellous Multi OS
//          M
// Output : 11
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public int LastChar(String str, char ch)
    {
        int i = 0;
        int iPos = -1;

        while(i < str.length())
        {
            if(str.charAt(i) == ch)
            {
                iPos = i;
            }

            i++;
        }

        return iPos;
    }
}

class program_ps164
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";
        char cValue = '\0';

        int iRet = 0;

        System.out.println("Enter string :");
        str = sobj.nextLine();

        System.out.println("Enter character :");
        cValue = sobj.next().charAt(0);

        StringX xobj = new StringX();

        iRet = xobj.LastChar(str,cValue);

        System.out.println("Character location is : " + iRet);
    }
}