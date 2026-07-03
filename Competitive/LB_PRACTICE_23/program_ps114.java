// ------------------------------------------------------------
// Problem Statement:
// Accept number of rows and number of columns from user and display below pattern.
// iRow = 3
// iCol = 4
//  *   #   *   #
//  *   #   *   #
//  *   #   *   #
//  
// ------------------------------------------------------------
import java.util.*;

class program_ps114
{
    public static void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }

            System.out.println();
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns :");
        iValue2 = sobj.nextInt();

        Display(iValue1, iValue2);

        sobj.close();
    }
}