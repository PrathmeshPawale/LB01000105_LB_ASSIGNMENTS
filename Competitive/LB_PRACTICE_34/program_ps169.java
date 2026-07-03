// ------------------------------------------------------------
// Problem Statement:
//
// Copy only small characters.
//
// Input  : Marvellous multi OS
// Output : arvellousmulti
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public String StrCpySmall(String str)
    {
        String dest = "";

        int i = 0;

        while(i < str.length())
        {
            if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
            {
                dest = dest + str.charAt(i);
            }

            i++;
        }

        return dest;
    }
}

class program_ps169
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";
        String sRet = "";

        System.out.println("Enter string :");
        str = sobj.nextLine();

        StringX xobj = new StringX();

        sRet = xobj.StrCpySmall(str);

        System.out.println("Small characters : " + sRet);
    }
}