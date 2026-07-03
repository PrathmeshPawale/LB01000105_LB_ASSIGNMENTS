// ------------------------------------------------------------
// Question :
//
// Write a program which checks whether
// 15th bit is ON or OFF.
// ------------------------------------------------------------
import java.util.*;
class Bitwise
{
    public boolean ChkBit(int iNo)
    {
        int iMask = 0x00004000;
        int iAns = 0;

        iAns = iNo & iMask;

        return(iAns == iMask);
    }
}
class program_ps171
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        Bitwise bobj = new Bitwise();

        bRet = bobj.ChkBit(iNo);

        if(bRet == true)
        {
            System.out.println("15th Bit is ON");
        }
        else
        {
            System.out.println("15th Bit is OFF");
        }
    }
}