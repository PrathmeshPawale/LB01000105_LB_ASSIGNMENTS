// ------------------------------------------------------------
// Question :
// Write a program which checks whether
// 5th and 18th bit is ON or OFF.
// ------------------------------------------------------------
import java.util.*;
class Bitwise
{
    public boolean ChkBit(int iNo)
    {
        int iMask = 0X00020010;
        int iAns = 0;

        iAns = iNo & iMask ;
        return (iAns == iMask);
    }
}
    public class program_ps172
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
            System.out.println("Both Bits are ON");
        }
        else
        {
            System.out.println("Both bits are OFF");
        }
    }
}
