// ------------------------------------------------------------
// Problem Statement:
//
// Copy first N characters of string.
//
// Input  : Marvellous Multi OS
//          10
// Output : Marvellous
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public String StrNCpyX(String str, int iCnt)
    {
        String dest = "";

        int i = 0;

        while((i < str.length()) && (iCnt > 0))
        {
            dest = dest + str.charAt(i);

            i++;
            iCnt--;
        }

        return dest;
    }
}

class program_ps167
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";
        String sRet = "";
        int iNo = 0;

        System.out.println("Enter string :");
        str = sobj.nextLine();

        System.out.println("Enter number of characters :");
        iNo = sobj.nextInt();

        StringX xobj = new StringX();

        sRet = xobj.StrNCpyX(str,iNo);

        System.out.println("Copied string is : " + sRet);
    }
}