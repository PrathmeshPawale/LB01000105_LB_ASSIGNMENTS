// ------------------------------------------------------------
// Problem Statement:
// Accept number of rows and number of columns from user and display below pattern.
// iRow = 4 
// iCol = 3
//   1    2   3
//   1    2   3
//   1    2   3
// ------------------------------------------------------------

import java.util.*;

class program_ps112
{
    public static void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns :");
        iValue2 = sobj.nextInt();

        Display(iValue1,iValue2);
    }
}