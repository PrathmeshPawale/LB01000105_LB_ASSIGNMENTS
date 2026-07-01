// -----------------------------------------------------------------------------
// Write a program which accepts two numbers from user and display
// position of common ON bits from that two numbers.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps187
{
    public static void CommonBits(int iNo1, int iNo2)
    {
        int iMask = 1;
        int iPos = 1;
        int iCommon = 0;

        iCommon = iNo1 & iNo2;

        System.out.print("Common ON bit positions are : ");

        while(iMask != 0)
        {
            if((iCommon & iMask) == iMask)
            {
                System.out.print(iPos + " ");
            }

            iMask = iMask << 1;
            iPos++;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;

        System.out.print("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        iNo2 = sobj.nextInt();

        CommonBits(iNo1, iNo2);
    }
}