// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user and
// one character. Return frequency of that character.
//
// Input  : Marvellous Multi OS
//          M
// Output : 2
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public int CountChar(String str, char ch)
    {
        int i = 0;
        int iCnt = 0;

        while(i < str.length())
        {
            if(str.charAt(i) == ch)
            {
                iCnt++;
            }

            i++;
        }

        return iCnt;
    }
}

class program_ps162
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

        iRet = xobj.CountChar(str,cValue);

        System.out.println("Character frequency is : " + iRet);
    }
}