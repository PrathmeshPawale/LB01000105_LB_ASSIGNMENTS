// ------------------------------------------------------------
// Problem Statement:
//
// Write a program which accepts string
// and checks whether it contains vowel
// or not.
//
// Input : Demo
//
// Output : TRUE
// ------------------------------------------------------------

import java.util.*;

class StringX
{
    public boolean ChkVowel(String str)
    {
        int i = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u' ||

               ch == 'A' || ch == 'E' ||
               ch == 'I' || ch == 'O' ||
               ch == 'U')
            {
                return true;
            }

            i++;
        }

        return false;
    }
}

class program_ps154
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "";

        boolean bRet = false;

        System.out.println("Enter string :");

        str = sobj.nextLine();

        StringX xobj = new StringX();

        bRet = xobj.ChkVowel(str);

        if(bRet == true)
        {
            System.out.println("Contains Vowel");
        }
        else
        {
            System.out.println("There is no vowel");
        }
    }
}