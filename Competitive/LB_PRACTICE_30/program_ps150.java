// ------------------------------------------------------------
// Problem Statement:
//
// Accept character and display its ASCII value
// in Decimal, Octal and Hexadecimal format.
// ------------------------------------------------------------

import java.util.*;

class CharacterX
{
    public void Display(char ch)
    {
        System.out.println("Decimal : " + (int)ch);

        System.out.println("Octal : "
                + Integer.toOctalString((int)ch));

        System.out.println("Hexadecimal : "
                + Integer.toHexString((int)ch)
                .toUpperCase());
    }
}

class program_ps150
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        System.out.println("Enter the character :");

        cValue = sobj.next().charAt(0);

        CharacterX cobj = new CharacterX();

        cobj.Display(cValue);
    }
}