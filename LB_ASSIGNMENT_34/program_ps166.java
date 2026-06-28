// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user and
// copy the contents into another string.
//
// Input  : Marvellous Multi OS
// Output : Marvellous Multi OS
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public String StrCpyX(String str)
    {
        String dest = "";

        int i = 0;

        while(i < str.length())
        {
            dest = dest + str.charAt(i);
            i++;
        }

        return dest;
    }
}

class program_ps166
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";
        String sRet = "";

        System.out.println("Enter string :");
        str = sobj.nextLine();

        StringX xobj = new StringX();

        sRet = xobj.StrCpyX(str);

        System.out.println("Copied string is : " + sRet);
    }
}