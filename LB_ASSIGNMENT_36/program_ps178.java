// -----------------------------------------------------------------------------
// Write a program which accepts one number from user and TOGGLE 7th bit
// of that number. Return modified number.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps178
{
    public static int ToggleBit(int iNo)
    {
        int iMask = 0x00000040;

        iNo = iNo ^ iMask;

        return iNo;
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