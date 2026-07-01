// -----------------------------------------------------------------------------
// Write a program which accepts one number and two positions from user
// and check whether bit at first position OR bit at second position is ON.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps189
{
    public static boolean ChkBit(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 1;
        int iMask2 = 1;

        iMask1 = iMask1 << (iPos1 - 1);
        iMask2 = iMask2 << (iPos2 - 1);

        return (((iNo & iMask1) == iMask1) || ((iNo & iMask2) == iMask2));
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iPos1 = 0;
        int iPos2 = 0;

        boolean bRet = false;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        System.out.print("Enter first position : ");
        iPos1 = sobj.nextInt();

        System.out.print("Enter second position : ");
        iPos2 = sobj.nextInt();

        bRet = ChkBit(iNo, iPos1, iPos2);

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