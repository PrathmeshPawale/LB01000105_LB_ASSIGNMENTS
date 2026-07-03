// ------------------------------------------------------------
// Question :
// Write a program which checks whether
// 7th,8th and 9th bit is ON or OFF.
// ------------------------------------------------------------

import java.util.*;

class Bitwise
{
    public boolean ChkBit(int iNo)
    {
        int iMask = 0x000001C0;
        int iAns = 0;

        iAns = iNo & iMask;

        return (iAns == iMask);
    }
}

class program_ps174
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter number :");
        iNo = sobj.nextInt();

        Bitwise bobj = new Bitwise();

        bRet = bobj.ChkBit(iNo);

        if(bRet == true)
        {
            System.out.println("All Bits are ON");
        }
        else
        {
            System.out.println("Bits are OFF");
        }
    }
}