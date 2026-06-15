// ------------------------------------------------------------
// Problem Statement:
// Accept number from user and display below pattern.
// IP : 8
// OP : 2   4   6   8   10  12  14  16
// ------------------------------------------------------------

import java.util.*;

public class program_ps110
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print((iCnt*2)+"\t");
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