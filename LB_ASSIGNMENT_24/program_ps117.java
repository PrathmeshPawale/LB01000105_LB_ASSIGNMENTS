
// ------------------------------------------------------------
// Problem Statement:
// Accept number of rows and number of columns from user and display below pattern.
// iRow = 4 
// iCol = 4
//   A    B   C   D
//   a    b   c   d
//   A    B   C   D
//   a    b   c   d
// ------------------------------------------------------------
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch1 = '\0';
        char ch2 = '\0';

        for(i = 1;i <= iRow; i++)
        {
            for(j=1,ch1 = 'A', ch2 ='a'; j <= iCol; j++)
            {   
                if(i%2 == 0)
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
                else
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }
            }
            System.out.println();
        }
    }
}
class program_ps117
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}