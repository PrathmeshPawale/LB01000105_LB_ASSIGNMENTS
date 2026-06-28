// ------------------------------------------------------------
// Problem Statement:
//
// Copy only capital characters.
//
// Input  : Marvellous Multi OS
// Output : MMOS
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public String StrCpyCap(String str)
    {
        String dest = "";

        int i = 0;

        while(i < str.length())
        {
            if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
            {
                dest = dest + str.charAt(i);
            }

            i++;
        }

        return dest;
    }
}

class program_ps168
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";
        String sRet = "";

        System.out.println("Enter string :");
        str = sobj.nextLine();

        StringX xobj = new StringX();

        sRet = xobj.StrCpyCap(str);

        System.out.println("Capital characters : " + sRet);
    }
}