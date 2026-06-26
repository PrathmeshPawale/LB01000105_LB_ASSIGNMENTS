// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user
// and convert it into upper case.
//
// Input  : Marvellous Multi OS
// Output : MARVELLOUS MULTI OS
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public void struprx(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        while(i < Arr.length)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char)(Arr[i] - 32);
            }

            i++;
        }

        System.out.println("Modified string is : " + new String(Arr));
    }
}

class program_ps157
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        xobj.struprx(str);
    }
}