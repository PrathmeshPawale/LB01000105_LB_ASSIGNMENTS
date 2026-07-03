// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user
// and convert it into lower case.
//
// Input  : Marvellous Multi OS
// Output : marvellous multi os
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public void strlwrx(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        while(i < Arr.length)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = (char)(Arr[i] + 32);
            }

            i++;
        }

        System.out.println("Modified string is : " + new String(Arr));
    }
}

class program_ps156
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        xobj.strlwrx(str);
    }
}