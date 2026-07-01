// -----------------------------------------------------------------------------
// Write a program which accepts one number and position from user and
// ON that bit. Return modified number.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps183
{
    public static int OnBit(int iNo, int iPos)
    {
        int iMask = 0x00000001;

        iMask = iMask << (iPos - 1);

        return (iNo | iMask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iPos = 0;
        int iRet = 0;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        System.out.print("Enter position : ");
        iPos = sobj.nextInt();

        iRet = OnBit(iNo, iPos);

        System.out.println("Updated number is : " + iRet);
    }
}