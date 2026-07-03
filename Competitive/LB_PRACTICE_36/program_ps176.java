// -----------------------------------------------------------------------------
// Write a program which accepts one number from user and OFF 7th bit
// of that number if it is ON. Return modified number.
// -----------------------------------------------------------------------------
import java.util.*;

class program_ps176
{
    public static int OffBit(int iNo)
    {
        int iMask = 0x00000040; 

        if((iNo & iMask) == iMask)  
        {
            iNo = iNo ^ iMask;      
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