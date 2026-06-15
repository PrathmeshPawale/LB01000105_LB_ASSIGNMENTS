// ------------------------------------------------------------
// Problem Statement:
// Accept number from user and display below pattern.
// IP : 5
// OP : 5   #   4   #   3   #   2   #   1   #
// ------------------------------------------------------------

import java.util.*;

public class program_ps107
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t#\t");
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