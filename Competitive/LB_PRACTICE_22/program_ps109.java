// ------------------------------------------------------------
// Problem Statement:
// Accept number from user and display below pattern.
// IP : 5
// OP : #   1   *   #   2   *   #   3   *   #   4   *
// ------------------------------------------------------------

import java.util.*;

public class program_ps109
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t" + iCnt + "\t*\t");
        }
        System.out.println();
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of Elements :");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}