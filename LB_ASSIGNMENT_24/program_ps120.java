// ------------------------------------------------------------
// Problem Statement:
// Accept number of rows and number of columns from user and display below pattern.
// iRow = 3
// iCol = 4
//
// 1    2    3    4
// 5    6    7    8
// 9    10   11   12
//
// Time Complexity : O(R * C)
// Space Complexity : O(1)
// ------------------------------------------------------------

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int iNum = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(iNum + "\t");
                iNum++;
            }

            System.out.println();
        }
    }
}

class program_ps120
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);

        sobj.close();
    }
}