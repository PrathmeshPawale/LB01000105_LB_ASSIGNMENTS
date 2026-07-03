// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user
// and reverse that string in place.
//
// Input  : abcd
// Output : dcba
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public void StrRevX(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length - 1;

        char temp = '\0';

        while(iStart < iEnd)
        {
            temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = temp;

            iStart++;
            iEnd--;
        }

        System.out.println("Modified string is : " + new String(Arr));
    }
}

class program_ps165
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        xobj.StrRevX(str);
    }
}