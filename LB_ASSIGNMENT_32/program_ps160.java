// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user
// and count number of white spaces.
//
// Input  : Marvellous
// Output : 0
//
// Input  : Marvellous Infosystems
// Output : 1
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public int CountWhite(String str)
    {
        int i = 0;

        int iCnt = 0;

        while(i < str.length())
        {
            if(str.charAt(i) == ' ')
            {
                iCnt++;
            }

            i++;
        }

        return iCnt;
    }
}
class program_ps160
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        int iRet = 0;

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        iRet = xobj.CountWhite(str);

        System.out.println(iRet);
    }
}