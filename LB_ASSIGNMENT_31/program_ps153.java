// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string
// and return difference between frequency
// of small and capital characters.
//
// Input : Marvellous
//
// Output : 6
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public int Difference(String str)
    {
        int i = 0;

        int iSmall = 0;

        int iCapital = 0;

        while(i < str.length())
        {
            if(str.charAt(i) >= 'a' &&
               str.charAt(i) <= 'z')
            {
                iSmall++;
            }

            else if(str.charAt(i) >= 'A' &&
                    str.charAt(i) <= 'Z')
            {
                iCapital++;
            }

            i++;
        }

        return iSmall - iCapital;
    }
}

class program_ps153
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        int iRet = 0;

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        iRet = xobj.Difference(str);

        System.out.println(iRet);
    }
}