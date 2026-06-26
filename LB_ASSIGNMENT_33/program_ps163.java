// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user and
// one character. Return index of first occurrence.
//
// Input  : Marvellous Multi OS
//          e
// Output : 4
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public int FirstChar(String str, char ch)
    {
        int i = 0;

        while(i < str.length())
        {
            if(str.charAt(i) == ch)
            {
                return i;
            }

            i++;
        }

        return -1;
    }
}

class program_ps163
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

        iRet = xobj.FirstChar(str,cValue);

        System.out.println("Character location is : " + iRet);
    }
}