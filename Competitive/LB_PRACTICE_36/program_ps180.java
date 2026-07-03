// -----------------------------------------------------------------------------
// Write a program which accepts one number from user and ON its first
// 4 bits. Return modified number.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps180
{
    public static int OnBit(int iNo)
    {
        int iMask = 0x0000000F;      

        iNo = iNo | iMask;

        return iNo;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        iRet = OnBit(iNo);

        System.out.println("Updated number is : " + iRet);
    }
}