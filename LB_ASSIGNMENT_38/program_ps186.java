// -----------------------------------------------------------------------------
// Write a program which accepts one number from user and count number of
// ON (1) bits in it without using % and / operator.
// -----------------------------------------------------------------------------

import java.util.*;

class program_ps186
{
    public static int CountOne(int iNo)
    {
        int iMask = 1;
        int iCnt = 0;

        while(iMask != 0)
        {
            if((iNo & iMask) == iMask)
            {
                iCnt++;
            }

            iMask = iMask << 1;
        }

        return iCnt;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.print("Enter number : ");
        iNo = sobj.nextInt();

        iRet = CountOne(iNo);

        System.out.println("Number of ON bits are : " + iRet);
    }
}