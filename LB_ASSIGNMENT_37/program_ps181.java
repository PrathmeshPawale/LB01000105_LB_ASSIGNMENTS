// -----------------------------------------------------------------------------
// Write a program which accepts one number and position from user and
// checks whether bit at that position is ON or OFF.
// If bit is ON return TRUE otherwise return FALSE.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps181
{
    public static boolean ChkBit(int iNo, int iPos)
    {
        int iMask = 0x00000001;
        int iAns = 0;

        iMask = iMask << (iPos - 1);

        iAns = iNo & iMask;

        return (iAns == iMask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iPos = 0;
        boolean bRet = false;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        System.out.print("Enter position : ");
        iPos = sobj.nextInt();

        bRet = ChkBit(iNo, iPos);

        if(bRet)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }
    }
}