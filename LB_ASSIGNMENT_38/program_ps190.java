// -----------------------------------------------------------------------------
// Write a program which accepts one number and range of positions from
// user. Toggle all bits from that range.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps190
{
    public static int ToggleBitRange(int iNo, int iStart, int iEnd)
    {
        int iMask = 0;

        for(int iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            iMask = iMask | (1 << (iCnt - 1));
        }

        return (iNo ^ iMask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iStart = 0;
        int iEnd = 0;
        int iRet = 0;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        System.out.print("Enter starting position : ");
        iStart = sobj.nextInt();

        System.out.print("Enter ending position : ");
        iEnd = sobj.nextInt();

        iRet = ToggleBitRange(iNo, iStart, iEnd);

        System.out.println("Updated number is : " + iRet);
    }
}