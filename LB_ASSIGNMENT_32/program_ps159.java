// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string from user
// and display only digits from that string.
//
// Input  : marve89llous121
// Output : 89121
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public void DisplayDigit(String str)
    {
        int i = 0;

        while(i < str.length())
        {
            if(str.charAt(i) >= '0' &&
               str.charAt(i) <= '9')
            {
                System.out.print(str.charAt(i));
            }

            i++;
        }
    }
}

class program_ps159
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        xobj.DisplayDigit(str);
    }
}