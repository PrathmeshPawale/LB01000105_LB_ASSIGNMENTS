// -----------------------------------------------------------------------------
// Write a program which accepts one number from user and check whether
// 9th or 12th bit is ON or OFF.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps188
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x00000900;
        int iAns = 0;

        iAns = iNo & iMask;

        return (iAns != 0);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        bRet = ChkBit(iNo);

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