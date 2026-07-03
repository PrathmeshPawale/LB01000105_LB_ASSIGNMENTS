// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string
// and display it in reverse order.
//
// Input : Marvellous
//
// Output : suollevraM
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public void Reverse(String str)
    {
        int i = 0;

        for(i = str.length()-1;
            i >= 0;
            i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}

class program_ps155
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        xobj.Reverse(str);
    }
}