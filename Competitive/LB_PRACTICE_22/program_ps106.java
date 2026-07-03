// ------------------------------------------------------------
// Problem Statement:
// Accept number from user and display below pattern.
// IP : 5
// OP : A   B   C   D   E 
// ------------------------------------------------------------

import java.util.*;

public class program_ps106
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';
        for(iCnt = 1,ch = 'A'; iCnt <= iNo; iCnt++,ch++)
        {
            System.out.print(ch+"\t");
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