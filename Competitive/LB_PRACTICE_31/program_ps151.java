// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user
// and count number of capital characters.
//
// Input  : Marvellous Multi OS
// Output : 4
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int i = 0;
        int iCnt = 0;

        while(i < str.length())
        {
            if(str.charAt(i) >= 'A' &&
               str.charAt(i) <= 'Z')
            {
                iCnt++;
            }

            i++;
        }

        return iCnt;
    }
}

class program_ps151
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        int iRet = 0;

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        iRet = xobj.CountCapital(str);

        System.out.println(iRet);
    }
}