// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user
// and count number of small characters.
//
// Input : Marvellous
// Output : 9
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int i = 0;
        int iCnt = 0;

        while(i < str.length())
        {
            if(str.charAt(i) >= 'a' &&
               str.charAt(i) <= 'z')
            {
                iCnt++;
            }

            i++;
        }

        return iCnt;
    }
}

class program_ps152
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        int iRet = 0;

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        iRet = xobj.CountSmall(str);

        System.out.println(iRet);

    }
}