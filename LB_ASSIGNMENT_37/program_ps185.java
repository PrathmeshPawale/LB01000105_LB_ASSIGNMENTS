// -----------------------------------------------------------------------------
// Write a program which accepts one number and toggles contents of first
// and last nibble of the number.
// (Nibble = Group of 4 bits)
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps185
{
    public static int ToggleBit(int iNo)
    {
        int iMask = 0xF000000F;

        return (iNo ^ iMask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        iRet = ToggleBit(iNo);

        System.out.println("Updated number is : " + iRet);
    }
}