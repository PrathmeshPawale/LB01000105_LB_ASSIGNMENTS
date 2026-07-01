// -----------------------------------------------------------------------------
// Write a program which accepts one number from user and OFF 7th and
// 10th bit of that number. Return modified number.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps177
{
    public static int OffBit(int iNo)
    {
        int iMask = 0x00000240;      // 7th and 10th bits

        if((iNo & iMask) != 0)
        {
            iNo = iNo & (~iMask);
        }

        return iNo;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        iRet = OffBit(iNo);

        System.out.println("Updated number is : " + iRet);
    }
}