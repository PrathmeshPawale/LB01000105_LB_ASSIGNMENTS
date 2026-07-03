// ------------------------------------------------------------
// Problem Statement:
//
// Accept two strings and concatenate second
// string after first string.
//
// Input  : Marvellous Infosystems
//          Logic Building
//
// Output : Marvellous Infosystems Logic Building
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public String StrCatX(String str1, String str2)
    {
        String dest = str1;

        int i = 0;

        while(i < str2.length())
        {
            dest = dest + str2.charAt(i);
            i++;
        }

        return dest;
    }
}

class program_ps170
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = "";
        String str2 = "";
        String sRet = "";

        System.out.println("Enter first string :");
        str1 = sobj.nextLine();

        System.out.println("Enter second string :");
        str2 = sobj.nextLine();

        StringX xobj = new StringX();

        sRet = xobj.StrCatX(str1,str2);

        System.out.println("Concatenated string is : " + sRet);
    }
}